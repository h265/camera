.class Lcom/sonyericsson/cameracommon/utility/MeasurePerformance$MeasureTime;
.super Ljava/lang/Object;
.source "MeasurePerformance.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sonyericsson/cameracommon/utility/MeasurePerformance;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "MeasureTime"
.end annotation


# instance fields
.field public additionalInfo:Ljava/lang/String;

.field public id:Lcom/sonyericsson/cameracommon/utility/MeasurePerformance$PerformanceIds;

.field public kind:Lcom/sonyericsson/cameracommon/utility/MeasurePerformance$MeasureKind;

.field public time:J


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 165
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/sonyericsson/cameracommon/utility/MeasurePerformance$1;)V
    .locals 0
    .param p1, "x0"    # Lcom/sonyericsson/cameracommon/utility/MeasurePerformance$1;

    .prologue
    .line 165
    invoke-direct {p0}, Lcom/sonyericsson/cameracommon/utility/MeasurePerformance$MeasureTime;-><init>()V

    return-void
.end method
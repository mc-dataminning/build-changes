import javax.annotation.Nullable;

public final class mj {
   public static final mj a = a("all");
   public static final mj b = a("texture", a);
   public static final mj c = a("particle", b);
   public static final mj d = a("end", a);
   public static final mj e = a("bottom", d);
   public static final mj f = a("top", d);
   public static final mj g = a("front", a);
   public static final mj h = a("back", a);
   public static final mj i = a("side", a);
   public static final mj j = a("north", i);
   public static final mj k = a("south", i);
   public static final mj l = a("east", i);
   public static final mj m = a("west", i);
   public static final mj n = a("up");
   public static final mj o = a("down");
   public static final mj p = a("cross");
   public static final mj q = a("plant");
   public static final mj r = a("wall", a);
   public static final mj s = a("rail");
   public static final mj t = a("wool");
   public static final mj u = a("pattern");
   public static final mj v = a("pane");
   public static final mj w = a("edge");
   public static final mj x = a("fan");
   public static final mj y = a("stem");
   public static final mj z = a("upperstem");
   public static final mj A = a("crop");
   public static final mj B = a("dirt");
   public static final mj C = a("fire");
   public static final mj D = a("lantern");
   public static final mj E = a("platform");
   public static final mj F = a("unsticky");
   public static final mj G = a("torch");
   public static final mj H = a("layer0");
   public static final mj I = a("layer1");
   public static final mj J = a("layer2");
   public static final mj K = a("lit_log");
   public static final mj L = a("candle");
   public static final mj M = a("inside");
   public static final mj N = a("content");
   public static final mj O = a("inner_top");
   public static final mj P = a("flowerbed");
   private final String Q;
   @Nullable
   private final mj R;

   private static mj a(String $$0) {
      return new mj($$0, null);
   }

   private static mj a(String $$0, mj $$1) {
      return new mj($$0, $$1);
   }

   private mj(String $$0, @Nullable mj $$1) {
      this.Q = $$0;
      this.R = $$1;
   }

   public String a() {
      return this.Q;
   }

   @Nullable
   public mj b() {
      return this.R;
   }

   @Override
   public String toString() {
      return "#" + this.Q;
   }
}

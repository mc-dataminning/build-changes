import javax.annotation.Nullable;

public final class lj {
   public static final lj a = a("all");
   public static final lj b = a("texture", a);
   public static final lj c = a("particle", b);
   public static final lj d = a("end", a);
   public static final lj e = a("bottom", d);
   public static final lj f = a("top", d);
   public static final lj g = a("front", a);
   public static final lj h = a("back", a);
   public static final lj i = a("side", a);
   public static final lj j = a("north", i);
   public static final lj k = a("south", i);
   public static final lj l = a("east", i);
   public static final lj m = a("west", i);
   public static final lj n = a("up");
   public static final lj o = a("down");
   public static final lj p = a("cross");
   public static final lj q = a("plant");
   public static final lj r = a("wall", a);
   public static final lj s = a("rail");
   public static final lj t = a("wool");
   public static final lj u = a("pattern");
   public static final lj v = a("pane");
   public static final lj w = a("edge");
   public static final lj x = a("fan");
   public static final lj y = a("stem");
   public static final lj z = a("upperstem");
   public static final lj A = a("crop");
   public static final lj B = a("dirt");
   public static final lj C = a("fire");
   public static final lj D = a("lantern");
   public static final lj E = a("platform");
   public static final lj F = a("unsticky");
   public static final lj G = a("torch");
   public static final lj H = a("layer0");
   public static final lj I = a("layer1");
   public static final lj J = a("layer2");
   public static final lj K = a("lit_log");
   public static final lj L = a("candle");
   public static final lj M = a("inside");
   public static final lj N = a("content");
   public static final lj O = a("inner_top");
   public static final lj P = a("flowerbed");
   private final String Q;
   @Nullable
   private final lj R;

   private static lj a(String $$0) {
      return new lj($$0, null);
   }

   private static lj a(String $$0, lj $$1) {
      return new lj($$0, $$1);
   }

   private lj(String $$0, @Nullable lj $$1) {
      this.Q = $$0;
      this.R = $$1;
   }

   public String a() {
      return this.Q;
   }

   @Nullable
   public lj b() {
      return this.R;
   }

   @Override
   public String toString() {
      return "#" + this.Q;
   }
}

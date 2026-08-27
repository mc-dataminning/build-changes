import javax.annotation.Nullable;

public final class nj {
   public static final nj a = a("all");
   public static final nj b = a("texture", a);
   public static final nj c = a("particle", b);
   public static final nj d = a("end", a);
   public static final nj e = a("bottom", d);
   public static final nj f = a("top", d);
   public static final nj g = a("front", a);
   public static final nj h = a("back", a);
   public static final nj i = a("side", a);
   public static final nj j = a("north", i);
   public static final nj k = a("south", i);
   public static final nj l = a("east", i);
   public static final nj m = a("west", i);
   public static final nj n = a("up");
   public static final nj o = a("down");
   public static final nj p = a("cross");
   public static final nj q = a("plant");
   public static final nj r = a("wall", a);
   public static final nj s = a("rail");
   public static final nj t = a("wool");
   public static final nj u = a("pattern");
   public static final nj v = a("pane");
   public static final nj w = a("edge");
   public static final nj x = a("fan");
   public static final nj y = a("stem");
   public static final nj z = a("upperstem");
   public static final nj A = a("crop");
   public static final nj B = a("dirt");
   public static final nj C = a("fire");
   public static final nj D = a("lantern");
   public static final nj E = a("platform");
   public static final nj F = a("unsticky");
   public static final nj G = a("torch");
   public static final nj H = a("layer0");
   public static final nj I = a("layer1");
   public static final nj J = a("layer2");
   public static final nj K = a("lit_log");
   public static final nj L = a("candle");
   public static final nj M = a("inside");
   public static final nj N = a("content");
   public static final nj O = a("inner_top");
   public static final nj P = a("flowerbed");
   private final String Q;
   @Nullable
   private final nj R;

   private static nj a(String $$0) {
      return new nj($$0, null);
   }

   private static nj a(String $$0, nj $$1) {
      return new nj($$0, $$1);
   }

   private nj(String $$0, @Nullable nj $$1) {
      this.Q = $$0;
      this.R = $$1;
   }

   public String a() {
      return this.Q;
   }

   @Nullable
   public nj b() {
      return this.R;
   }

   @Override
   public String toString() {
      return "#" + this.Q;
   }
}

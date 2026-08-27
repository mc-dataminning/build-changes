import javax.annotation.Nullable;

public final class nv {
   public static final nv a = a("all");
   public static final nv b = a("texture", a);
   public static final nv c = a("particle", b);
   public static final nv d = a("end", a);
   public static final nv e = a("bottom", d);
   public static final nv f = a("top", d);
   public static final nv g = a("front", a);
   public static final nv h = a("back", a);
   public static final nv i = a("side", a);
   public static final nv j = a("north", i);
   public static final nv k = a("south", i);
   public static final nv l = a("east", i);
   public static final nv m = a("west", i);
   public static final nv n = a("up");
   public static final nv o = a("down");
   public static final nv p = a("cross");
   public static final nv q = a("plant");
   public static final nv r = a("wall", a);
   public static final nv s = a("rail");
   public static final nv t = a("wool");
   public static final nv u = a("pattern");
   public static final nv v = a("pane");
   public static final nv w = a("edge");
   public static final nv x = a("fan");
   public static final nv y = a("stem");
   public static final nv z = a("upperstem");
   public static final nv A = a("crop");
   public static final nv B = a("dirt");
   public static final nv C = a("fire");
   public static final nv D = a("lantern");
   public static final nv E = a("platform");
   public static final nv F = a("unsticky");
   public static final nv G = a("torch");
   public static final nv H = a("layer0");
   public static final nv I = a("layer1");
   public static final nv J = a("layer2");
   public static final nv K = a("lit_log");
   public static final nv L = a("candle");
   public static final nv M = a("inside");
   public static final nv N = a("content");
   public static final nv O = a("inner_top");
   public static final nv P = a("flowerbed");
   private final String Q;
   @Nullable
   private final nv R;

   private static nv a(String $$0) {
      return new nv($$0, null);
   }

   private static nv a(String $$0, nv $$1) {
      return new nv($$0, $$1);
   }

   private nv(String $$0, @Nullable nv $$1) {
      this.Q = $$0;
      this.R = $$1;
   }

   public String a() {
      return this.Q;
   }

   @Nullable
   public nv b() {
      return this.R;
   }

   @Override
   public String toString() {
      return "#" + this.Q;
   }
}

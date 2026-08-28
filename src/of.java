import javax.annotation.Nullable;

public final class of {
   public static final of a = a("all");
   public static final of b = a("texture", a);
   public static final of c = a("particle", b);
   public static final of d = a("end", a);
   public static final of e = a("bottom", d);
   public static final of f = a("top", d);
   public static final of g = a("front", a);
   public static final of h = a("back", a);
   public static final of i = a("side", a);
   public static final of j = a("north", i);
   public static final of k = a("south", i);
   public static final of l = a("east", i);
   public static final of m = a("west", i);
   public static final of n = a("up");
   public static final of o = a("down");
   public static final of p = a("cross");
   public static final of q = a("plant");
   public static final of r = a("wall", a);
   public static final of s = a("rail");
   public static final of t = a("wool");
   public static final of u = a("pattern");
   public static final of v = a("pane");
   public static final of w = a("edge");
   public static final of x = a("fan");
   public static final of y = a("stem");
   public static final of z = a("upperstem");
   public static final of A = a("crop");
   public static final of B = a("dirt");
   public static final of C = a("fire");
   public static final of D = a("lantern");
   public static final of E = a("platform");
   public static final of F = a("unsticky");
   public static final of G = a("torch");
   public static final of H = a("layer0");
   public static final of I = a("layer1");
   public static final of J = a("layer2");
   public static final of K = a("lit_log");
   public static final of L = a("candle");
   public static final of M = a("inside");
   public static final of N = a("content");
   public static final of O = a("inner_top");
   public static final of P = a("flowerbed");
   private final String Q;
   @Nullable
   private final of R;

   private static of a(String $$0) {
      return new of($$0, null);
   }

   private static of a(String $$0, of $$1) {
      return new of($$0, $$1);
   }

   private of(String $$0, @Nullable of $$1) {
      this.Q = $$0;
      this.R = $$1;
   }

   public String a() {
      return this.Q;
   }

   @Nullable
   public of b() {
      return this.R;
   }

   @Override
   public String toString() {
      return "#" + this.Q;
   }
}

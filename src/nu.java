import javax.annotation.Nullable;

public final class nu {
   public static final nu a = a("all");
   public static final nu b = a("texture", a);
   public static final nu c = a("particle", b);
   public static final nu d = a("end", a);
   public static final nu e = a("bottom", d);
   public static final nu f = a("top", d);
   public static final nu g = a("front", a);
   public static final nu h = a("back", a);
   public static final nu i = a("side", a);
   public static final nu j = a("north", i);
   public static final nu k = a("south", i);
   public static final nu l = a("east", i);
   public static final nu m = a("west", i);
   public static final nu n = a("up");
   public static final nu o = a("down");
   public static final nu p = a("cross");
   public static final nu q = a("plant");
   public static final nu r = a("wall", a);
   public static final nu s = a("rail");
   public static final nu t = a("wool");
   public static final nu u = a("pattern");
   public static final nu v = a("pane");
   public static final nu w = a("edge");
   public static final nu x = a("fan");
   public static final nu y = a("stem");
   public static final nu z = a("upperstem");
   public static final nu A = a("crop");
   public static final nu B = a("dirt");
   public static final nu C = a("fire");
   public static final nu D = a("lantern");
   public static final nu E = a("platform");
   public static final nu F = a("unsticky");
   public static final nu G = a("torch");
   public static final nu H = a("layer0");
   public static final nu I = a("layer1");
   public static final nu J = a("layer2");
   public static final nu K = a("lit_log");
   public static final nu L = a("candle");
   public static final nu M = a("inside");
   public static final nu N = a("content");
   public static final nu O = a("inner_top");
   public static final nu P = a("flowerbed");
   private final String Q;
   @Nullable
   private final nu R;

   private static nu a(String $$0) {
      return new nu($$0, null);
   }

   private static nu a(String $$0, nu $$1) {
      return new nu($$0, $$1);
   }

   private nu(String $$0, @Nullable nu $$1) {
      this.Q = $$0;
      this.R = $$1;
   }

   public String a() {
      return this.Q;
   }

   @Nullable
   public nu b() {
      return this.R;
   }

   @Override
   public String toString() {
      return "#" + this.Q;
   }
}

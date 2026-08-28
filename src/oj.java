import javax.annotation.Nullable;

public final class oj {
   public static final oj a = a("all");
   public static final oj b = a("texture", a);
   public static final oj c = a("particle", b);
   public static final oj d = a("end", a);
   public static final oj e = a("bottom", d);
   public static final oj f = a("top", d);
   public static final oj g = a("front", a);
   public static final oj h = a("back", a);
   public static final oj i = a("side", a);
   public static final oj j = a("north", i);
   public static final oj k = a("south", i);
   public static final oj l = a("east", i);
   public static final oj m = a("west", i);
   public static final oj n = a("up");
   public static final oj o = a("down");
   public static final oj p = a("cross");
   public static final oj q = a("plant");
   public static final oj r = a("wall", a);
   public static final oj s = a("rail");
   public static final oj t = a("wool");
   public static final oj u = a("pattern");
   public static final oj v = a("pane");
   public static final oj w = a("edge");
   public static final oj x = a("fan");
   public static final oj y = a("stem");
   public static final oj z = a("upperstem");
   public static final oj A = a("crop");
   public static final oj B = a("dirt");
   public static final oj C = a("fire");
   public static final oj D = a("lantern");
   public static final oj E = a("platform");
   public static final oj F = a("unsticky");
   public static final oj G = a("torch");
   public static final oj H = a("layer0");
   public static final oj I = a("layer1");
   public static final oj J = a("layer2");
   public static final oj K = a("lit_log");
   public static final oj L = a("candle");
   public static final oj M = a("inside");
   public static final oj N = a("content");
   public static final oj O = a("inner_top");
   public static final oj P = a("flowerbed");
   private final String Q;
   @Nullable
   private final oj R;

   private static oj a(String $$0) {
      return new oj($$0, null);
   }

   private static oj a(String $$0, oj $$1) {
      return new oj($$0, $$1);
   }

   private oj(String $$0, @Nullable oj $$1) {
      this.Q = $$0;
      this.R = $$1;
   }

   public String a() {
      return this.Q;
   }

   @Nullable
   public oj b() {
      return this.R;
   }

   @Override
   public String toString() {
      return "#" + this.Q;
   }
}

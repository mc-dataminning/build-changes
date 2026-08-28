import javax.annotation.Nullable;

public final class oc {
   public static final oc a = a("all");
   public static final oc b = a("texture", a);
   public static final oc c = a("particle", b);
   public static final oc d = a("end", a);
   public static final oc e = a("bottom", d);
   public static final oc f = a("top", d);
   public static final oc g = a("front", a);
   public static final oc h = a("back", a);
   public static final oc i = a("side", a);
   public static final oc j = a("north", i);
   public static final oc k = a("south", i);
   public static final oc l = a("east", i);
   public static final oc m = a("west", i);
   public static final oc n = a("up");
   public static final oc o = a("down");
   public static final oc p = a("cross");
   public static final oc q = a("plant");
   public static final oc r = a("wall", a);
   public static final oc s = a("rail");
   public static final oc t = a("wool");
   public static final oc u = a("pattern");
   public static final oc v = a("pane");
   public static final oc w = a("edge");
   public static final oc x = a("fan");
   public static final oc y = a("stem");
   public static final oc z = a("upperstem");
   public static final oc A = a("crop");
   public static final oc B = a("dirt");
   public static final oc C = a("fire");
   public static final oc D = a("lantern");
   public static final oc E = a("platform");
   public static final oc F = a("unsticky");
   public static final oc G = a("torch");
   public static final oc H = a("layer0");
   public static final oc I = a("layer1");
   public static final oc J = a("layer2");
   public static final oc K = a("lit_log");
   public static final oc L = a("candle");
   public static final oc M = a("inside");
   public static final oc N = a("content");
   public static final oc O = a("inner_top");
   public static final oc P = a("flowerbed");
   private final String Q;
   @Nullable
   private final oc R;

   private static oc a(String $$0) {
      return new oc($$0, null);
   }

   private static oc a(String $$0, oc $$1) {
      return new oc($$0, $$1);
   }

   private oc(String $$0, @Nullable oc $$1) {
      this.Q = $$0;
      this.R = $$1;
   }

   public String a() {
      return this.Q;
   }

   @Nullable
   public oc b() {
      return this.R;
   }

   @Override
   public String toString() {
      return "#" + this.Q;
   }
}

import javax.annotation.Nullable;

public final class oa {
   public static final oa a = a("all");
   public static final oa b = a("texture", a);
   public static final oa c = a("particle", b);
   public static final oa d = a("end", a);
   public static final oa e = a("bottom", d);
   public static final oa f = a("top", d);
   public static final oa g = a("front", a);
   public static final oa h = a("back", a);
   public static final oa i = a("side", a);
   public static final oa j = a("north", i);
   public static final oa k = a("south", i);
   public static final oa l = a("east", i);
   public static final oa m = a("west", i);
   public static final oa n = a("up");
   public static final oa o = a("down");
   public static final oa p = a("cross");
   public static final oa q = a("plant");
   public static final oa r = a("wall", a);
   public static final oa s = a("rail");
   public static final oa t = a("wool");
   public static final oa u = a("pattern");
   public static final oa v = a("pane");
   public static final oa w = a("edge");
   public static final oa x = a("fan");
   public static final oa y = a("stem");
   public static final oa z = a("upperstem");
   public static final oa A = a("crop");
   public static final oa B = a("dirt");
   public static final oa C = a("fire");
   public static final oa D = a("lantern");
   public static final oa E = a("frying_table");
   public static final oa F = a("platform");
   public static final oa G = a("unsticky");
   public static final oa H = a("torch");
   public static final oa I = a("layer0");
   public static final oa J = a("layer1");
   public static final oa K = a("layer2");
   public static final oa L = a("lit_log");
   public static final oa M = a("candle");
   public static final oa N = a("inside");
   public static final oa O = a("content");
   public static final oa P = a("inner_top");
   public static final oa Q = a("flowerbed");
   private final String R;
   @Nullable
   private final oa S;

   private static oa a(String $$0) {
      return new oa($$0, null);
   }

   private static oa a(String $$0, oa $$1) {
      return new oa($$0, $$1);
   }

   private oa(String $$0, @Nullable oa $$1) {
      this.R = $$0;
      this.S = $$1;
   }

   public String a() {
      return this.R;
   }

   @Nullable
   public oa b() {
      return this.S;
   }

   @Override
   public String toString() {
      return "#" + this.R;
   }
}

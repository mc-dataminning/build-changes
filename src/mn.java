import javax.annotation.Nullable;

public final class mn {
   public static final mn a = a("all");
   public static final mn b = a("texture", a);
   public static final mn c = a("particle", b);
   public static final mn d = a("end", a);
   public static final mn e = a("bottom", d);
   public static final mn f = a("top", d);
   public static final mn g = a("front", a);
   public static final mn h = a("back", a);
   public static final mn i = a("side", a);
   public static final mn j = a("north", i);
   public static final mn k = a("south", i);
   public static final mn l = a("east", i);
   public static final mn m = a("west", i);
   public static final mn n = a("up");
   public static final mn o = a("down");
   public static final mn p = a("cross");
   public static final mn q = a("plant");
   public static final mn r = a("wall", a);
   public static final mn s = a("rail");
   public static final mn t = a("wool");
   public static final mn u = a("pattern");
   public static final mn v = a("pane");
   public static final mn w = a("edge");
   public static final mn x = a("fan");
   public static final mn y = a("stem");
   public static final mn z = a("upperstem");
   public static final mn A = a("crop");
   public static final mn B = a("dirt");
   public static final mn C = a("fire");
   public static final mn D = a("lantern");
   public static final mn E = a("platform");
   public static final mn F = a("unsticky");
   public static final mn G = a("torch");
   public static final mn H = a("layer0");
   public static final mn I = a("layer1");
   public static final mn J = a("layer2");
   public static final mn K = a("lit_log");
   public static final mn L = a("candle");
   public static final mn M = a("inside");
   public static final mn N = a("content");
   public static final mn O = a("inner_top");
   public static final mn P = a("flowerbed");
   private final String Q;
   @Nullable
   private final mn R;

   private static mn a(String $$0) {
      return new mn($$0, null);
   }

   private static mn a(String $$0, mn $$1) {
      return new mn($$0, $$1);
   }

   private mn(String $$0, @Nullable mn $$1) {
      this.Q = $$0;
      this.R = $$1;
   }

   public String a() {
      return this.Q;
   }

   @Nullable
   public mn b() {
      return this.R;
   }

   @Override
   public String toString() {
      return "#" + this.Q;
   }
}

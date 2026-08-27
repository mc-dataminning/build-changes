import javax.annotation.Nullable;

public final class mr {
   public static final mr a = a("all");
   public static final mr b = a("texture", a);
   public static final mr c = a("particle", b);
   public static final mr d = a("end", a);
   public static final mr e = a("bottom", d);
   public static final mr f = a("top", d);
   public static final mr g = a("front", a);
   public static final mr h = a("back", a);
   public static final mr i = a("side", a);
   public static final mr j = a("north", i);
   public static final mr k = a("south", i);
   public static final mr l = a("east", i);
   public static final mr m = a("west", i);
   public static final mr n = a("up");
   public static final mr o = a("down");
   public static final mr p = a("cross");
   public static final mr q = a("plant");
   public static final mr r = a("wall", a);
   public static final mr s = a("rail");
   public static final mr t = a("wool");
   public static final mr u = a("pattern");
   public static final mr v = a("pane");
   public static final mr w = a("edge");
   public static final mr x = a("fan");
   public static final mr y = a("stem");
   public static final mr z = a("upperstem");
   public static final mr A = a("crop");
   public static final mr B = a("dirt");
   public static final mr C = a("fire");
   public static final mr D = a("lantern");
   public static final mr E = a("platform");
   public static final mr F = a("unsticky");
   public static final mr G = a("torch");
   public static final mr H = a("layer0");
   public static final mr I = a("layer1");
   public static final mr J = a("layer2");
   public static final mr K = a("lit_log");
   public static final mr L = a("candle");
   public static final mr M = a("inside");
   public static final mr N = a("content");
   public static final mr O = a("inner_top");
   public static final mr P = a("flowerbed");
   private final String Q;
   @Nullable
   private final mr R;

   private static mr a(String $$0) {
      return new mr($$0, null);
   }

   private static mr a(String $$0, mr $$1) {
      return new mr($$0, $$1);
   }

   private mr(String $$0, @Nullable mr $$1) {
      this.Q = $$0;
      this.R = $$1;
   }

   public String a() {
      return this.Q;
   }

   @Nullable
   public mr b() {
      return this.R;
   }

   @Override
   public String toString() {
      return "#" + this.Q;
   }
}

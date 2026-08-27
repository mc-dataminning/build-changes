import javax.annotation.Nullable;

public final class nl {
   public static final nl a = a("all");
   public static final nl b = a("texture", a);
   public static final nl c = a("particle", b);
   public static final nl d = a("end", a);
   public static final nl e = a("bottom", d);
   public static final nl f = a("top", d);
   public static final nl g = a("front", a);
   public static final nl h = a("back", a);
   public static final nl i = a("side", a);
   public static final nl j = a("north", i);
   public static final nl k = a("south", i);
   public static final nl l = a("east", i);
   public static final nl m = a("west", i);
   public static final nl n = a("up");
   public static final nl o = a("down");
   public static final nl p = a("cross");
   public static final nl q = a("plant");
   public static final nl r = a("wall", a);
   public static final nl s = a("rail");
   public static final nl t = a("wool");
   public static final nl u = a("pattern");
   public static final nl v = a("pane");
   public static final nl w = a("edge");
   public static final nl x = a("fan");
   public static final nl y = a("stem");
   public static final nl z = a("upperstem");
   public static final nl A = a("crop");
   public static final nl B = a("dirt");
   public static final nl C = a("fire");
   public static final nl D = a("lantern");
   public static final nl E = a("platform");
   public static final nl F = a("unsticky");
   public static final nl G = a("torch");
   public static final nl H = a("layer0");
   public static final nl I = a("layer1");
   public static final nl J = a("layer2");
   public static final nl K = a("lit_log");
   public static final nl L = a("candle");
   public static final nl M = a("inside");
   public static final nl N = a("content");
   public static final nl O = a("inner_top");
   public static final nl P = a("flowerbed");
   private final String Q;
   @Nullable
   private final nl R;

   private static nl a(String $$0) {
      return new nl($$0, null);
   }

   private static nl a(String $$0, nl $$1) {
      return new nl($$0, $$1);
   }

   private nl(String $$0, @Nullable nl $$1) {
      this.Q = $$0;
      this.R = $$1;
   }

   public String a() {
      return this.Q;
   }

   @Nullable
   public nl b() {
      return this.R;
   }

   @Override
   public String toString() {
      return "#" + this.Q;
   }
}

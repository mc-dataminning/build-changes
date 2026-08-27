import javax.annotation.Nullable;

public final class mt {
   public static final mt a = a("all");
   public static final mt b = a("texture", a);
   public static final mt c = a("particle", b);
   public static final mt d = a("end", a);
   public static final mt e = a("bottom", d);
   public static final mt f = a("top", d);
   public static final mt g = a("front", a);
   public static final mt h = a("back", a);
   public static final mt i = a("side", a);
   public static final mt j = a("north", i);
   public static final mt k = a("south", i);
   public static final mt l = a("east", i);
   public static final mt m = a("west", i);
   public static final mt n = a("up");
   public static final mt o = a("down");
   public static final mt p = a("cross");
   public static final mt q = a("plant");
   public static final mt r = a("wall", a);
   public static final mt s = a("rail");
   public static final mt t = a("wool");
   public static final mt u = a("pattern");
   public static final mt v = a("pane");
   public static final mt w = a("edge");
   public static final mt x = a("fan");
   public static final mt y = a("stem");
   public static final mt z = a("upperstem");
   public static final mt A = a("crop");
   public static final mt B = a("dirt");
   public static final mt C = a("fire");
   public static final mt D = a("lantern");
   public static final mt E = a("platform");
   public static final mt F = a("unsticky");
   public static final mt G = a("torch");
   public static final mt H = a("layer0");
   public static final mt I = a("layer1");
   public static final mt J = a("layer2");
   public static final mt K = a("lit_log");
   public static final mt L = a("candle");
   public static final mt M = a("inside");
   public static final mt N = a("content");
   public static final mt O = a("inner_top");
   public static final mt P = a("flowerbed");
   private final String Q;
   @Nullable
   private final mt R;

   private static mt a(String $$0) {
      return new mt($$0, null);
   }

   private static mt a(String $$0, mt $$1) {
      return new mt($$0, $$1);
   }

   private mt(String $$0, @Nullable mt $$1) {
      this.Q = $$0;
      this.R = $$1;
   }

   public String a() {
      return this.Q;
   }

   @Nullable
   public mt b() {
      return this.R;
   }

   @Override
   public String toString() {
      return "#" + this.Q;
   }
}

import javax.annotation.Nullable;

public final class mh {
   public static final mh a = a("all");
   public static final mh b = a("texture", a);
   public static final mh c = a("particle", b);
   public static final mh d = a("end", a);
   public static final mh e = a("bottom", d);
   public static final mh f = a("top", d);
   public static final mh g = a("front", a);
   public static final mh h = a("back", a);
   public static final mh i = a("side", a);
   public static final mh j = a("north", i);
   public static final mh k = a("south", i);
   public static final mh l = a("east", i);
   public static final mh m = a("west", i);
   public static final mh n = a("up");
   public static final mh o = a("down");
   public static final mh p = a("cross");
   public static final mh q = a("plant");
   public static final mh r = a("wall", a);
   public static final mh s = a("rail");
   public static final mh t = a("wool");
   public static final mh u = a("pattern");
   public static final mh v = a("pane");
   public static final mh w = a("edge");
   public static final mh x = a("fan");
   public static final mh y = a("stem");
   public static final mh z = a("upperstem");
   public static final mh A = a("crop");
   public static final mh B = a("dirt");
   public static final mh C = a("fire");
   public static final mh D = a("lantern");
   public static final mh E = a("platform");
   public static final mh F = a("unsticky");
   public static final mh G = a("torch");
   public static final mh H = a("layer0");
   public static final mh I = a("layer1");
   public static final mh J = a("layer2");
   public static final mh K = a("lit_log");
   public static final mh L = a("candle");
   public static final mh M = a("inside");
   public static final mh N = a("content");
   public static final mh O = a("inner_top");
   public static final mh P = a("flowerbed");
   private final String Q;
   @Nullable
   private final mh R;

   private static mh a(String $$0) {
      return new mh($$0, null);
   }

   private static mh a(String $$0, mh $$1) {
      return new mh($$0, $$1);
   }

   private mh(String $$0, @Nullable mh $$1) {
      this.Q = $$0;
      this.R = $$1;
   }

   public String a() {
      return this.Q;
   }

   @Nullable
   public mh b() {
      return this.R;
   }

   @Override
   public String toString() {
      return "#" + this.Q;
   }
}

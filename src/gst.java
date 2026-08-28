public class gst<T extends cjv> extends grt<T, gzf, gcu> {
   public static final aku a = aku.b("textures/entity/horse/donkey.png");
   public static final aku b = aku.b("textures/entity/horse/mule.png");
   private final aku k;

   public gst(gtd.a $$0, gga $$1, gga $$2, boolean $$3) {
      super($$0, new gcu($$0.a($$1)), new gcu($$0.a($$2)));
      this.k = $$3 ? b : a;
   }

   public aku a(gzf $$0) {
      return this.k;
   }

   public gzf a() {
      return new gzf();
   }

   public void a(T $$0, gzf $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.t();
   }
}

public class gpa<T extends cjb> extends gob<T, gvk, fzd> {
   public static final alj a = alj.b("textures/entity/horse/donkey.png");
   public static final alj b = alj.b("textures/entity/horse/mule.png");
   private final alj k;

   public gpa(gpk.a $$0, float $$1, gcj $$2, gcj $$3, boolean $$4) {
      super($$0, new fzd($$0.a($$2)), new fzd($$0.a($$3)), $$1);
      this.k = $$4 ? b : a;
   }

   public alj a(gvk $$0) {
      return this.k;
   }

   public gvk a() {
      return new gvk();
   }

   public void a(T $$0, gvk $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.q();
   }
}

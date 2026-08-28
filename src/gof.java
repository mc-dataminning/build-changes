public class gof extends gnt<clf, gur> {
   private static final all a = all.b("textures/entity/skeleton/bogged.png");
   private static final all b = all.b("textures/entity/skeleton/bogged_overlay.png");

   public gof(gpa.a $$0) {
      super($$0, gcb.x, gcb.y, new fyj($$0.a(gcb.w)));
      this.a(new gtq<>(this, $$0.f(), gcb.z, b));
   }

   public all a(gur $$0) {
      return a;
   }

   public gur a() {
      return new gur();
   }

   public void a(clf $$0, gur $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gz();
   }
}

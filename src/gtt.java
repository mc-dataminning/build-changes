public class gtt extends gqy<chp, gzu, gdb> {
   private static final akv a = akv.b("textures/entity/pig/pig.png");

   public gtt(gse.a $$0) {
      super($$0, new gdb($$0.a(gfc.bP)), new gdb($$0.a(gfc.ca)), 0.7F);
      this.a(new gwu<>(this, new gdb($$0.a(gfc.cc)), new gdb($$0.a(gfc.cb)), akv.b("textures/entity/pig/pig_saddle.png")));
   }

   public akv a(gzu $$0) {
      return a;
   }

   public gzu b() {
      return new gzu();
   }

   public void a(chp $$0, gzu $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.j();
   }
}

public class gft extends ght<cin, fra<cin>> {
   private static final akf a = new akf("textures/entity/breeze/breeze.png");

   public gft(ggn.a $$0) {
      super($$0, new fra<>($$0.a(fuq.s)), 0.5F);
      this.a(new gjx(this));
      this.a(new gjw(this));
   }

   public void a(cin $$0, float $$1, float $$2, exn $$3, gbe $$4, int $$5) {
      fra<cin> $$6 = this.a();
      a($$6, $$6.b(), $$6.d());
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public akf a(cin $$0) {
      return a;
   }

   public static fra<cin> a(fra<cin> $$0, fur... $$1) {
      $$0.b().k = false;
      $$0.c().k = false;
      $$0.d().k = false;
      $$0.e().k = false;

      for (fur $$2 : $$1) {
         $$2.k = true;
      }

      return $$0;
   }
}

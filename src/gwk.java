public class gwk extends gwd<gze, gcp> {
   public static final alz a = alz.b("textures/entity/trident_riptide.png");
   private final gdm b;

   public gwk(gtl<gze, gcp> $$0, gei $$1) {
      super($$0);
      this.b = new gdm($$1.a(gel.ck));
   }

   public void a(fgq $$0, glj $$1, int $$2, gze $$3, float $$4, float $$5) {
      if ($$3.ag) {
         fgu $$6 = $$1.getBuffer(this.b.a(a));
         this.b.a($$3);
         this.b.a($$0, $$6, $$2, hba.d);
      }
   }
}

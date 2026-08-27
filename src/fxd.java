import java.util.List;

public class fxd<T extends cap, M extends fgw<T>> extends fwr<T, M> {
   private final aep a;
   private final fxd.a<T> b;
   private final fxd.b<T, M> c;

   public fxd(fue<T, M> $$0, aep $$1, fxd.a<T> $$2, fxd.b<T, M> $$3) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
   }

   public void a(elh $$0, fng $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.cd()) {
         this.a();
         ell $$10 = $$1.getBuffer(fno.i(this.a));
         this.c().a($$0, $$10, $$2, ftk.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, this.b.apply($$3, $$6, $$7));
         this.b();
      }
   }

   private void a() {
      List<fhj> $$0 = this.c.getPartsToDraw(this.c());
      this.c().a().e().forEach($$0x -> $$0x.l = true);
      $$0.forEach($$0x -> $$0x.l = false);
   }

   private void b() {
      this.c().a().e().forEach($$0 -> $$0.l = false);
   }

   public interface a<T extends cap> {
      float apply(T var1, float var2, float var3);
   }

   public interface b<T extends cap, M extends fek<T>> {
      List<fhj> getPartsToDraw(M var1);
   }
}

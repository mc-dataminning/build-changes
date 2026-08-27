import java.util.List;

public class fxw<T extends cat, M extends fhk<T>> extends fxk<T, M> {
   private final aeu a;
   private final fxw.a<T> b;
   private final fxw.b<T, M> c;

   public fxw(fux<T, M> $$0, aeu $$1, fxw.a<T> $$2, fxw.b<T, M> $$3) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
   }

   public void a(elk $$0, fnz $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.cd()) {
         this.a();
         elo $$10 = $$1.getBuffer(foh.j(this.a));
         this.c().a($$0, $$10, $$2, fud.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, this.b.apply($$3, $$6, $$7));
         this.b();
      }
   }

   private void a() {
      List<fhx> $$0 = this.c.getPartsToDraw(this.c());
      this.c().a().e().forEach($$0x -> $$0x.l = true);
      $$0.forEach($$0x -> $$0x.l = false);
   }

   private void b() {
      this.c().a().e().forEach($$0 -> $$0.l = false);
   }

   public interface a<T extends cat> {
      float apply(T var1, float var2, float var3);
   }

   public interface b<T extends cat, M extends fey<T>> {
      List<fhx> getPartsToDraw(M var1);
   }
}

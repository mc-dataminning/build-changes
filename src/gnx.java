import java.util.List;

public class gnx<T extends cmd, M extends fwo<T>> extends gnl<T, M> {
   private final alf a;
   private final gnx.a<T> b;
   private final gnx.b<T, M> c;

   public gnx(gkv<T, M> $$0, alf $$1, gnx.a<T> $$2, gnx.b<T, M> $$3) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
   }

   public void a(faa $$0, gdq $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.ch()) {
         this.a();
         fae $$10 = $$1.getBuffer(gdy.j(this.a));
         this.c().a($$0, $$10, $$2, gka.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, this.b.apply($$3, $$6, $$7));
         this.b();
      }
   }

   private void a() {
      List<fxc> $$0 = this.c.getPartsToDraw(this.c());
      this.c().a().e().forEach($$0x -> $$0x.l = true);
      $$0.forEach($$0x -> $$0x.l = false);
   }

   private void b() {
      this.c().a().e().forEach($$0 -> $$0.l = false);
   }

   public interface a<T extends cmd> {
      float apply(T var1, float var2, float var3);
   }

   public interface b<T extends cmd, M extends fuc<T>> {
      List<fxc> getPartsToDraw(M var1);
   }
}

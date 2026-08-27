import java.util.List;

public class ghv<T extends chw, M extends fqp<T>> extends ghj<T, M> {
   private final ajh a;
   private final ghv.a<T> b;
   private final ghv.b<T, M> c;

   public ghv(get<T, M> $$0, ajh $$1, ghv.a<T> $$2, ghv.b<T, M> $$3) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
   }

   public void a(etz $$0, fxq $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.ce()) {
         this.a();
         eud $$10 = $$1.getBuffer(fxy.j(this.a));
         this.c().a($$0, $$10, $$2, gdz.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, this.b.apply($$3, $$6, $$7));
         this.b();
      }
   }

   private void a() {
      List<frd> $$0 = this.c.getPartsToDraw(this.c());
      this.c().a().e().forEach($$0x -> $$0x.l = true);
      $$0.forEach($$0x -> $$0x.l = false);
   }

   private void b() {
      this.c().a().e().forEach($$0 -> $$0.l = false);
   }

   public interface a<T extends chw> {
      float apply(T var1, float var2, float var3);
   }

   public interface b<T extends chw, M extends foc<T>> {
      List<frd> getPartsToDraw(M var1);
   }
}

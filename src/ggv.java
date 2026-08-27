import java.util.List;

public class ggv<T extends che, M extends fpr<T>> extends ggj<T, M> {
   private final ajc a;
   private final ggv.a<T> b;
   private final ggv.b<T, M> c;

   public ggv(gdt<T, M> $$0, ajc $$1, ggv.a<T> $$2, ggv.b<T, M> $$3) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
   }

   public void a(etd $$0, fwq $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.cb()) {
         this.a();
         eth $$10 = $$1.getBuffer(fwy.j(this.a));
         this.c().a($$0, $$10, $$2, gcz.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, this.b.apply($$3, $$6, $$7));
         this.b();
      }
   }

   private void a() {
      List<fqf> $$0 = this.c.getPartsToDraw(this.c());
      this.c().a().e().forEach($$0x -> $$0x.l = true);
      $$0.forEach($$0x -> $$0x.l = false);
   }

   private void b() {
      this.c().a().e().forEach($$0 -> $$0.l = false);
   }

   public interface a<T extends che> {
      float apply(T var1, float var2, float var3);
   }

   public interface b<T extends che, M extends fne<T>> {
      List<fqf> getPartsToDraw(M var1);
   }
}

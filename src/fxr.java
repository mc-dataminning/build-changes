import java.util.List;

public class fxr<T extends caq, M extends fhf<T>> extends fxf<T, M> {
   private final aer a;
   private final fxr.a<T> b;
   private final fxr.b<T, M> c;

   public fxr(fus<T, M> $$0, aer $$1, fxr.a<T> $$2, fxr.b<T, M> $$3) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
   }

   public void a(elf $$0, fnu $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.cd()) {
         this.a();
         elj $$10 = $$1.getBuffer(foc.j(this.a));
         this.c().a($$0, $$10, $$2, fty.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, this.b.apply($$3, $$6, $$7));
         this.b();
      }
   }

   private void a() {
      List<fhs> $$0 = this.c.getPartsToDraw(this.c());
      this.c().a().e().forEach($$0x -> $$0x.l = true);
      $$0.forEach($$0x -> $$0x.l = false);
   }

   private void b() {
      this.c().a().e().forEach($$0 -> $$0.l = false);
   }

   public interface a<T extends caq> {
      float apply(T var1, float var2, float var3);
   }

   public interface b<T extends caq, M extends fet<T>> {
      List<fhs> getPartsToDraw(M var1);
   }
}

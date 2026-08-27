import java.util.Optional;

public class tv implements tj.c {
   private static final int c = 5;
   private static final int d = 6;
   private final int e;
   private int f;
   private ewp g;
   private final ir.a h;
   private final ir i;

   public tv(ir $$0, int $$1) {
      this.e = $$1;
      this.h = $$0.j();
      this.g = new ewp(this.h);
      this.i = $$0;
   }

   @Override
   public Optional<tg> spawnStructure(tg $$0) {
      ir $$1 = new ir(this.h);
      $$0.b($$1);
      $$0.n();
      ewp $$2 = tw.a($$0.e());
      this.g = this.g.b($$2);
      this.h.e((int)$$2.b() + 5, 0, 0);
      if (++this.f >= this.e) {
         this.f = 0;
         this.h.e(0, 0, (int)this.g.d() + 6);
         this.h.p(this.i.u());
         this.g = new ewp(this.h);
      }

      return Optional.of($$0);
   }
}

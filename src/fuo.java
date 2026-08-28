import java.util.List;
import javax.annotation.Nullable;

public class fuo extends frw {
   private static final int a = 310;
   private static final int b = 25;
   private static final xj c = xj.c("menu.server_links.title");
   private final frw d;
   @Nullable
   private fuo.a s;
   final fps u = new fps(this);
   final amb v;

   public fuo(frw $$0, amb $$1) {
      super(c);
      this.d = $$0;
      this.v = $$1;
   }

   @Override
   protected void aR_() {
      this.u.a(this.l, this.p);
      this.s = this.u.c(new fuo.a(this.m, this.n, this));
      this.u.b(fmd.a(xi.k, $$0 -> this.aO_()).a(200).a());
      this.u.a($$1 -> {
         fmb var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.u.a();
      if (this.s != null) {
         this.s.a(this.n, this.u);
      }
   }

   @Override
   public void aO_() {
      this.m.a(this.d);
   }

   static class a extends fmj<fuo.b> {
      public a(fke $$0, int $$1, fuo $$2) {
         super($$0, $$1, $$2.u.d(), $$2.u.c(), 25);
         $$2.v.c().forEach($$1x -> this.b(new fuo.b($$2, $$1x)));
      }

      @Override
      public int b() {
         return 310;
      }

      @Override
      public void a(int $$0, fps $$1) {
         super.a($$0, $$1);
         int $$2 = $$0 / 2 - 155;
         this.aH_().forEach($$1x -> $$1x.a.m($$2));
      }
   }

   static class b extends fmj.a<fuo.b> {
      final fmb a;

      b(frw $$0, amb.a $$1) {
         this.a = fmd.a($$1.a(), fqt.b($$0, $$1.c(), false)).a(310).a();
      }

      @Override
      public void a(flq $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a.n($$2);
         this.a.a($$0, $$6, $$7, $$9);
      }

      @Override
      public List<? extends foa> aH_() {
         return List.of(this.a);
      }

      @Override
      public List<? extends fpz> b() {
         return List.of(this.a);
      }
   }
}

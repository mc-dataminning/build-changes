import java.util.List;
import javax.annotation.Nullable;

public class gcz extends gaf {
   private static final int a = 310;
   private static final int b = 25;
   private static final xc c = xc.c("menu.server_links.title");
   private final gaf d;
   @Nullable
   private gcz.a s;
   final fyb u = new fyb(this);
   final amc v;

   public gcz(gaf $$0, amc $$1) {
      super(c);
      this.d = $$0;
      this.v = $$1;
   }

   @Override
   protected void aS_() {
      this.u.a(this.l, this.p);
      this.s = this.u.c(new gcz.a(this.m, this.n, this));
      this.u.b(fun.a(xb.k, $$0 -> this.aP_()).a(200).a());
      this.u.a($$1 -> {
         ful var10000 = this.c($$1);
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
   public void aP_() {
      this.m.a(this.d);
   }

   static class a extends fut<gcz.b> {
      public a(frf $$0, int $$1, gcz $$2) {
         super($$0, $$1, $$2.u.d(), $$2.u.c(), 25);
         $$2.v.c().forEach($$1x -> this.b(new gcz.b($$2, $$1x)));
      }

      @Override
      public int a() {
         return 310;
      }

      @Override
      public void a(int $$0, fyb $$1) {
         super.a($$0, $$1);
         int $$2 = $$0 / 2 - 155;
         this.aI_().forEach($$1x -> $$1x.a.j($$2));
      }
   }

   static class b extends fut.a<gcz.b> {
      final ful a;

      b(gaf $$0, amc.a $$1) {
         this.a = fun.a($$1.a(), fzc.b($$0, $$1.c(), false)).a(310).a();
      }

      @Override
      public void a(ftz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a.k($$2);
         this.a.a($$0, $$6, $$7, $$9);
      }

      @Override
      public List<? extends fwk> aI_() {
         return List.of(this.a);
      }

      @Override
      public List<? extends fyi> b() {
         return List.of(this.a);
      }
   }
}

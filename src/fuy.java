import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fuy implements aqd {
   private Map<dgq<?>, fuz<?>> d = ImmutableMap.of();
   private final ewk e;
   private final fml f;
   public cti a;
   public eul b;
   public elk c;
   private final Supplier<ftt> g;
   private final Supplier<fzd> h;
   private final Supplier<fyd> i;

   public fuy(ewk $$0, fml $$1, Supplier<ftt> $$2, Supplier<fzd> $$3, Supplier<fyd> $$4) {
      this.h = $$3;
      this.i = $$4;
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   @Nullable
   public <E extends dgo> fuz<E> a(E $$0) {
      return (fuz<E>)this.d.get($$0.v());
   }

   public void a(cti $$0, eul $$1, elk $$2) {
      if (this.a != $$0) {
         this.a($$0);
      }

      this.b = $$1;
      this.c = $$2;
   }

   public <E extends dgo> void a(E $$0, float $$1, ept $$2, fsz $$3) {
      fuz<E> $$4 = this.a($$0);
      if ($$4 != null) {
         if ($$0.n() && $$0.v().a($$0.r())) {
            if ($$4.a($$0, this.b.b())) {
               a($$0, () -> a($$4, $$0, $$1, $$2, $$3));
            }
         }
      }
   }

   private static <T extends dgo> void a(fuz<T> $$0, T $$1, float $$2, ept $$3, fsz $$4) {
      cti $$5 = $$1.i();
      int $$6;
      if ($$5 != null) {
         $$6 = fsx.a($$5, $$1.aB_());
      } else {
         $$6 = 15728880;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6, gdw.d);
   }

   public <E extends dgo> boolean a(E $$0, ept $$1, fsz $$2, int $$3, int $$4) {
      fuz<E> $$5 = this.a($$0);
      if ($$5 == null) {
         return true;
      } else {
         a($$0, () -> $$5.a($$0, 0.0F, $$1, $$2, $$3, $$4));
         return false;
      }
   }

   private static void a(dgo $$0, Runnable $$1) {
      try {
         $$1.run();
      } catch (Throwable var5) {
         o $$3 = o.a(var5, "Rendering Block Entity");
         p $$4 = $$3.a("Block Entity Details");
         $$0.a($$4);
         throw new y($$3);
      }
   }

   public void a(@Nullable cti $$0) {
      this.a = $$0;
      if ($$0 == null) {
         this.b = null;
      }
   }

   @Override
   public void a(aqc $$0) {
      fva.a $$1 = new fva.a(this, this.g.get(), this.h.get(), this.i.get(), this.f, this.e);
      this.d = fvb.a($$1);
   }
}

import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class gsx implements ave {
   private Map<dxo<?>, gsy<?>> d = ImmutableMap.of();
   private final fsf e;
   private final Supplier<gjk> f;
   public djh a;
   public fow b;
   public fev c;
   private final grp g;
   private final hga h;
   private final gxr i;
   private final gwr j;

   public gsx(fsf $$0, Supplier<gjk> $$1, grp $$2, hga $$3, gxr $$4, gwr $$5) {
      this.i = $$4;
      this.h = $$3;
      this.j = $$5;
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   @Nullable
   public <E extends dxm> gsy<E> a(E $$0) {
      return (gsy<E>)this.d.get($$0.p());
   }

   public void a(djh $$0, fow $$1, fev $$2) {
      if (this.a != $$0) {
         this.a($$0);
      }

      this.b = $$1;
      this.c = $$2;
   }

   public <E extends dxm> void a(E $$0, float $$1, fjy $$2, gqm $$3) {
      gsy<E> $$4 = this.a($$0);
      if ($$4 != null) {
         if ($$0.l() && $$0.p().a($$0.m())) {
            if ($$4.a($$0, this.b.b())) {
               try {
                  a($$4, $$0, $$1, $$2, $$3, this.b.b());
               } catch (Throwable var9) {
                  p $$6 = p.a(var9, "Rendering Block Entity");
                  q $$7 = $$6.a("Block Entity Details");
                  $$0.a($$7);
                  throw new aa($$6);
               }
            }
         }
      }
   }

   private static <T extends dxm> void a(gsy<T> $$0, T $$1, float $$2, fjy $$3, gqm $$4, fex $$5) {
      djh $$6 = $$1.i();
      int $$7;
      if ($$6 != null) {
         $$7 = gqh.a($$6, $$1.ax_());
      } else {
         $$7 = 15728880;
      }

      $$0.a($$1, $$2, $$3, $$4, $$7, hja.d, $$5);
   }

   public void a(@Nullable djh $$0) {
      this.a = $$0;
      if ($$0 == null) {
         this.b = null;
      }
   }

   @Override
   public void a(avd $$0) {
      gsz.a $$1 = new gsz.a(this, this.g, this.h, this.i, this.j, this.f.get(), this.e);
      this.d = gta.a($$1);
   }
}

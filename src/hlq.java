import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class hlq implements hkx {
   public static final String a = "particle";
   private final List<grh> b;
   private final Map<ja, List<grh>> c;
   private final boolean d;
   private final boolean e;
   private final boolean f;
   private final hix g;
   private final grr h;

   public hlq(List<grh> $$0, Map<ja, List<grh>> $$1, boolean $$2, boolean $$3, boolean $$4, hix $$5, grr $$6) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$4;
      this.f = $$3;
      this.g = $$5;
      this.h = $$6;
   }

   public static hkx a(List<gri> $$0, grt $$1, hlr $$2, hln $$3, boolean $$4, boolean $$5, boolean $$6, grr $$7) {
      hix $$8 = a($$2, $$1, "particle");
      hlq.a $$9 = new hlq.a($$4, $$5, $$6, $$7).a($$8);

      for (gri $$10 : $$0) {
         for (ja $$11 : $$10.c.keySet()) {
            grj $$12 = $$10.c.get($$11);
            hix $$13 = a($$2, $$1, $$12.c());
            if ($$12.a() == null) {
               $$9.a(a($$10, $$12, $$13, $$11, $$3));
            } else {
               $$9.a(ja.a($$3.a().c(), $$12.a()), a($$10, $$12, $$13, $$11, $$3));
            }
         }
      }

      return $$9.b();
   }

   private static grh a(gri $$0, grj $$1, hix $$2, ja $$3, hln $$4) {
      return gro.a($$0.a, $$0.b, $$1, $$2, $$3, $$4, $$0.d, $$0.e, $$0.f);
   }

   private static hix a(hlr $$0, grt $$1, String $$2) {
      hle $$3 = $$1.a($$2);
      return $$3 != null ? $$0.a($$3) : $$0.a($$2);
   }

   @Override
   public List<grh> a(@Nullable eah $$0, @Nullable ja $$1, azv $$2) {
      return $$1 == null ? this.b : this.c.get($$1);
   }

   @Override
   public boolean a() {
      return this.d;
   }

   @Override
   public boolean b() {
      return this.e;
   }

   @Override
   public boolean c() {
      return this.f;
   }

   @Override
   public hix d() {
      return this.g;
   }

   @Override
   public grr e() {
      return this.h;
   }

   public static class a {
      private final Builder<grh> a = ImmutableList.builder();
      private final Map<ja, Builder<grh>> b = af.a(ja.class, $$0x -> ImmutableList.builder());
      private final boolean c;
      @Nullable
      private hix d;
      private final boolean e;
      private final boolean f;
      private final grr g;

      public a(boolean $$0, boolean $$1, boolean $$2, grr $$3) {
         this.c = $$0;
         this.e = $$1;
         this.f = $$2;
         this.g = $$3;
      }

      public hlq.a a(ja $$0, grh $$1) {
         this.b.get($$0).add($$1);
         return this;
      }

      public hlq.a a(grh $$0) {
         this.a.add($$0);
         return this;
      }

      public hlq.a a(hix $$0) {
         this.d = $$0;
         return this;
      }

      public hlq.a a() {
         return this;
      }

      public hkx b() {
         if (this.d == null) {
            throw new RuntimeException("Missing particle!");
         } else {
            Map<ja, List<grh>> $$0 = af.a(this.b, Builder::build);
            return new hlq(this.a.build(), new EnumMap<>($$0), this.c, this.e, this.f, this.d, this.g);
         }
      }
   }
}

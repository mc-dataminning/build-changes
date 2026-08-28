import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableList.Builder;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class hhf implements hgm {
   public static final String a = "particle";
   private final List<gnc> b;
   private final Map<jn, List<gnc>> c;
   private final boolean d;
   private final boolean e;
   private final boolean f;
   private final hem g;
   private final gnm h;

   public hhf(List<gnc> $$0, Map<jn, List<gnc>> $$1, boolean $$2, boolean $$3, boolean $$4, hem $$5, gnm $$6) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$4;
      this.f = $$3;
      this.g = $$5;
      this.h = $$6;
   }

   public static hgm a(List<gnd> $$0, gno $$1, hhg $$2, hhc $$3, boolean $$4, boolean $$5, boolean $$6, gnm $$7) {
      hem $$8 = a($$2, $$1, "particle");
      hhf.a $$9 = new hhf.a($$4, $$5, $$6, $$7).a($$8);

      for (gnd $$10 : $$0) {
         for (jn $$11 : $$10.c.keySet()) {
            gne $$12 = $$10.c.get($$11);
            hem $$13 = a($$2, $$1, $$12.c());
            if ($$12.a() == null) {
               $$9.a(a($$10, $$12, $$13, $$11, $$3));
            } else {
               $$9.a(jn.a($$3.a().c(), $$12.a()), a($$10, $$12, $$13, $$11, $$3));
            }
         }
      }

      return $$9.b();
   }

   private static gnc a(gnd $$0, gne $$1, hem $$2, jn $$3, hhc $$4) {
      return gnj.a($$0.a, $$0.b, $$1, $$2, $$3, $$4, $$0.d, $$0.e, $$0.f);
   }

   private static hem a(hhg $$0, gno $$1, String $$2) {
      hgt $$3 = $$1.a($$2);
      return $$3 != null ? $$0.a($$3) : $$0.a($$2);
   }

   @Override
   public List<gnc> a(@Nullable dwv $$0, @Nullable jn $$1, azg $$2) {
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
   public hem d() {
      return this.g;
   }

   @Override
   public gnm e() {
      return this.h;
   }

   public static class a {
      private final Builder<gnc> a = ImmutableList.builder();
      private final EnumMap<jn, Builder<gnc>> b = Maps.newEnumMap(jn.class);
      private final boolean c;
      @Nullable
      private hem d;
      private final boolean e;
      private final boolean f;
      private final gnm g;

      public a(boolean $$0, boolean $$1, boolean $$2, gnm $$3) {
         this.c = $$0;
         this.e = $$1;
         this.f = $$2;
         this.g = $$3;

         for (jn $$4 : jn.values()) {
            this.b.put($$4, ImmutableList.builder());
         }
      }

      public hhf.a a(jn $$0, gnc $$1) {
         this.b.get($$0).add($$1);
         return this;
      }

      public hhf.a a(gnc $$0) {
         this.a.add($$0);
         return this;
      }

      public hhf.a a(hem $$0) {
         this.d = $$0;
         return this;
      }

      public hhf.a a() {
         return this;
      }

      public hgm b() {
         if (this.d == null) {
            throw new RuntimeException("Missing particle!");
         } else {
            Map<jn, List<gnc>> $$0 = Maps.transformValues(this.b, Builder::build);
            return new hhf(this.a.build(), new EnumMap<>($$0), this.c, this.e, this.f, this.d, this.g);
         }
      }
   }
}

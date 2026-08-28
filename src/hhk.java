import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableList.Builder;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class hhk implements hgr {
   public static final String a = "particle";
   private final List<gne> b;
   private final Map<jn, List<gne>> c;
   private final boolean d;
   private final boolean e;
   private final boolean f;
   private final her g;
   private final gno h;

   public hhk(List<gne> $$0, Map<jn, List<gne>> $$1, boolean $$2, boolean $$3, boolean $$4, her $$5, gno $$6) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$4;
      this.f = $$3;
      this.g = $$5;
      this.h = $$6;
   }

   public static hgr a(List<gnf> $$0, gnq $$1, hhl $$2, hhh $$3, boolean $$4, boolean $$5, boolean $$6, gno $$7) {
      her $$8 = a($$2, $$1, "particle");
      hhk.a $$9 = new hhk.a($$4, $$5, $$6, $$7).a($$8);

      for (gnf $$10 : $$0) {
         for (jn $$11 : $$10.c.keySet()) {
            gng $$12 = $$10.c.get($$11);
            her $$13 = a($$2, $$1, $$12.c());
            if ($$12.a() == null) {
               $$9.a(a($$10, $$12, $$13, $$11, $$3));
            } else {
               $$9.a(jn.a($$3.a().c(), $$12.a()), a($$10, $$12, $$13, $$11, $$3));
            }
         }
      }

      return $$9.b();
   }

   private static gne a(gnf $$0, gng $$1, her $$2, jn $$3, hhh $$4) {
      return gnl.a($$0.a, $$0.b, $$1, $$2, $$3, $$4, $$0.d, $$0.e, $$0.f);
   }

   private static her a(hhl $$0, gnq $$1, String $$2) {
      hgy $$3 = $$1.a($$2);
      return $$3 != null ? $$0.a($$3) : $$0.a($$2);
   }

   @Override
   public List<gne> a(@Nullable dww $$0, @Nullable jn $$1, azh $$2) {
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
   public her d() {
      return this.g;
   }

   @Override
   public gno e() {
      return this.h;
   }

   public static class a {
      private final Builder<gne> a = ImmutableList.builder();
      private final EnumMap<jn, Builder<gne>> b = Maps.newEnumMap(jn.class);
      private final boolean c;
      @Nullable
      private her d;
      private final boolean e;
      private final boolean f;
      private final gno g;

      public a(boolean $$0, boolean $$1, boolean $$2, gno $$3) {
         this.c = $$0;
         this.e = $$1;
         this.f = $$2;
         this.g = $$3;

         for (jn $$4 : jn.values()) {
            this.b.put($$4, ImmutableList.builder());
         }
      }

      public hhk.a a(jn $$0, gne $$1) {
         this.b.get($$0).add($$1);
         return this;
      }

      public hhk.a a(gne $$0) {
         this.a.add($$0);
         return this;
      }

      public hhk.a a(her $$0) {
         this.d = $$0;
         return this;
      }

      public hhk.a a() {
         return this;
      }

      public hgr b() {
         if (this.d == null) {
            throw new RuntimeException("Missing particle!");
         } else {
            Map<jn, List<gne>> $$0 = Maps.transformValues(this.b, Builder::build);
            return new hhk(this.a.build(), new EnumMap<>($$0), this.c, this.e, this.f, this.d, this.g);
         }
      }
   }
}

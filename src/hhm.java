import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableList.Builder;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class hhm implements hgt {
   public static final String a = "particle";
   private final List<gng> b;
   private final Map<jn, List<gng>> c;
   private final boolean d;
   private final boolean e;
   private final boolean f;
   private final het g;
   private final gnq h;

   public hhm(List<gng> $$0, Map<jn, List<gng>> $$1, boolean $$2, boolean $$3, boolean $$4, het $$5, gnq $$6) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$4;
      this.f = $$3;
      this.g = $$5;
      this.h = $$6;
   }

   public static hgt a(List<gnh> $$0, gns $$1, hhn $$2, hhj $$3, boolean $$4, boolean $$5, boolean $$6, gnq $$7) {
      het $$8 = a($$2, $$1, "particle");
      hhm.a $$9 = new hhm.a($$4, $$5, $$6, $$7).a($$8);

      for (gnh $$10 : $$0) {
         for (jn $$11 : $$10.c.keySet()) {
            gni $$12 = $$10.c.get($$11);
            het $$13 = a($$2, $$1, $$12.c());
            if ($$12.a() == null) {
               $$9.a(a($$10, $$12, $$13, $$11, $$3));
            } else {
               $$9.a(jn.a($$3.a().c(), $$12.a()), a($$10, $$12, $$13, $$11, $$3));
            }
         }
      }

      return $$9.b();
   }

   private static gng a(gnh $$0, gni $$1, het $$2, jn $$3, hhj $$4) {
      return gnn.a($$0.a, $$0.b, $$1, $$2, $$3, $$4, $$0.d, $$0.e, $$0.f);
   }

   private static het a(hhn $$0, gns $$1, String $$2) {
      hha $$3 = $$1.a($$2);
      return $$3 != null ? $$0.a($$3) : $$0.a($$2);
   }

   @Override
   public List<gng> a(@Nullable dwy $$0, @Nullable jn $$1, azh $$2) {
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
   public het d() {
      return this.g;
   }

   @Override
   public gnq e() {
      return this.h;
   }

   public static class a {
      private final Builder<gng> a = ImmutableList.builder();
      private final EnumMap<jn, Builder<gng>> b = Maps.newEnumMap(jn.class);
      private final boolean c;
      @Nullable
      private het d;
      private final boolean e;
      private final boolean f;
      private final gnq g;

      public a(boolean $$0, boolean $$1, boolean $$2, gnq $$3) {
         this.c = $$0;
         this.e = $$1;
         this.f = $$2;
         this.g = $$3;

         for (jn $$4 : jn.values()) {
            this.b.put($$4, ImmutableList.builder());
         }
      }

      public hhm.a a(jn $$0, gng $$1) {
         this.b.get($$0).add($$1);
         return this;
      }

      public hhm.a a(gng $$0) {
         this.a.add($$0);
         return this;
      }

      public hhm.a a(het $$0) {
         this.d = $$0;
         return this;
      }

      public hhm.a a() {
         return this;
      }

      public hgt b() {
         if (this.d == null) {
            throw new RuntimeException("Missing particle!");
         } else {
            Map<jn, List<gng>> $$0 = Maps.transformValues(this.b, Builder::build);
            return new hhm(this.a.build(), new EnumMap<>($$0), this.c, this.e, this.f, this.d, this.g);
         }
      }
   }
}

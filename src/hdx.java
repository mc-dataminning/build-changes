import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableList.Builder;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class hdx implements hdg {
   protected final List<gml> a;
   protected final Map<jm, List<gml>> b;
   protected final boolean c;
   protected final boolean d;
   protected final boolean e;
   protected final hbe f;
   protected final gmw g;

   public hdx(List<gml> $$0, Map<jm, List<gml>> $$1, boolean $$2, boolean $$3, boolean $$4, hbe $$5, gmw $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$4;
      this.e = $$3;
      this.f = $$5;
      this.g = $$6;
   }

   @Override
   public List<gml> a(@Nullable dxn $$0, @Nullable jm $$1, bam $$2) {
      return $$1 == null ? this.a : this.b.get($$1);
   }

   @Override
   public boolean a() {
      return this.c;
   }

   @Override
   public boolean b() {
      return this.d;
   }

   @Override
   public boolean c() {
      return this.e;
   }

   @Override
   public boolean d() {
      return false;
   }

   @Override
   public hbe e() {
      return this.f;
   }

   @Override
   public gmw f() {
      return this.g;
   }

   public static class a {
      private final Builder<gml> a = ImmutableList.builder();
      private final EnumMap<jm, Builder<gml>> b = Maps.newEnumMap(jm.class);
      private final boolean c;
      @Nullable
      private hbe d;
      private final boolean e;
      private final boolean f;
      private final gmw g;

      public a(gmq $$0, boolean $$1) {
         this($$0.b(), $$0.c().a(), $$1, $$0.g());
      }

      private a(boolean $$0, boolean $$1, boolean $$2, gmw $$3) {
         this.c = $$0;
         this.e = $$1;
         this.f = $$2;
         this.g = $$3;

         for (jm $$4 : jm.values()) {
            this.b.put($$4, ImmutableList.builder());
         }
      }

      public hdx.a a(jm $$0, gml $$1) {
         this.b.get($$0).add($$1);
         return this;
      }

      public hdx.a a(gml $$0) {
         this.a.add($$0);
         return this;
      }

      public hdx.a a(hbe $$0) {
         this.d = $$0;
         return this;
      }

      public hdx.a a() {
         return this;
      }

      public hdg b() {
         if (this.d == null) {
            throw new RuntimeException("Missing particle!");
         } else {
            Map<jm, List<gml>> $$0 = Maps.transformValues(this.b, Builder::build);
            return new hdx(this.a.build(), new EnumMap<>($$0), this.c, this.e, this.f, this.d, this.g);
         }
      }
   }
}

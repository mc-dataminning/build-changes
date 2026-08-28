import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableList.Builder;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class hec implements hdl {
   protected final List<gmq> a;
   protected final Map<jm, List<gmq>> b;
   protected final boolean c;
   protected final boolean d;
   protected final boolean e;
   protected final hbj f;
   protected final gnb g;

   public hec(List<gmq> $$0, Map<jm, List<gmq>> $$1, boolean $$2, boolean $$3, boolean $$4, hbj $$5, gnb $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$4;
      this.e = $$3;
      this.f = $$5;
      this.g = $$6;
   }

   @Override
   public List<gmq> a(@Nullable dxu $$0, @Nullable jm $$1, bam $$2) {
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
   public hbj e() {
      return this.f;
   }

   @Override
   public gnb f() {
      return this.g;
   }

   public static class a {
      private final Builder<gmq> a = ImmutableList.builder();
      private final EnumMap<jm, Builder<gmq>> b = Maps.newEnumMap(jm.class);
      private final boolean c;
      @Nullable
      private hbj d;
      private final boolean e;
      private final boolean f;
      private final gnb g;

      public a(gmv $$0, boolean $$1) {
         this($$0.b(), $$0.c().a(), $$1, $$0.g());
      }

      private a(boolean $$0, boolean $$1, boolean $$2, gnb $$3) {
         this.c = $$0;
         this.e = $$1;
         this.f = $$2;
         this.g = $$3;

         for (jm $$4 : jm.values()) {
            this.b.put($$4, ImmutableList.builder());
         }
      }

      public hec.a a(jm $$0, gmq $$1) {
         this.b.get($$0).add($$1);
         return this;
      }

      public hec.a a(gmq $$0) {
         this.a.add($$0);
         return this;
      }

      public hec.a a(hbj $$0) {
         this.d = $$0;
         return this;
      }

      public hec.a a() {
         return this;
      }

      public hdl b() {
         if (this.d == null) {
            throw new RuntimeException("Missing particle!");
         } else {
            Map<jm, List<gmq>> $$0 = Maps.transformValues(this.b, Builder::build);
            return new hec(this.a.build(), new EnumMap<>($$0), this.c, this.e, this.f, this.d, this.g);
         }
      }
   }
}

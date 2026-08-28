import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableList.Builder;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class hed implements hdm {
   protected final List<gmr> a;
   protected final Map<jm, List<gmr>> b;
   protected final boolean c;
   protected final boolean d;
   protected final boolean e;
   protected final hbk f;
   protected final gnc g;

   public hed(List<gmr> $$0, Map<jm, List<gmr>> $$1, boolean $$2, boolean $$3, boolean $$4, hbk $$5, gnc $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$4;
      this.e = $$3;
      this.f = $$5;
      this.g = $$6;
   }

   @Override
   public List<gmr> a(@Nullable dxu $$0, @Nullable jm $$1, bam $$2) {
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
   public hbk e() {
      return this.f;
   }

   @Override
   public gnc f() {
      return this.g;
   }

   public static class a {
      private final Builder<gmr> a = ImmutableList.builder();
      private final EnumMap<jm, Builder<gmr>> b = Maps.newEnumMap(jm.class);
      private final boolean c;
      @Nullable
      private hbk d;
      private final boolean e;
      private final boolean f;
      private final gnc g;

      public a(gmw $$0, boolean $$1) {
         this($$0.b(), $$0.c().a(), $$1, $$0.g());
      }

      private a(boolean $$0, boolean $$1, boolean $$2, gnc $$3) {
         this.c = $$0;
         this.e = $$1;
         this.f = $$2;
         this.g = $$3;

         for (jm $$4 : jm.values()) {
            this.b.put($$4, ImmutableList.builder());
         }
      }

      public hed.a a(jm $$0, gmr $$1) {
         this.b.get($$0).add($$1);
         return this;
      }

      public hed.a a(gmr $$0) {
         this.a.add($$0);
         return this;
      }

      public hed.a a(hbk $$0) {
         this.d = $$0;
         return this;
      }

      public hed.a a() {
         return this;
      }

      public hdm b() {
         if (this.d == null) {
            throw new RuntimeException("Missing particle!");
         } else {
            Map<jm, List<gmr>> $$0 = Maps.transformValues(this.b, Builder::build);
            return new hed(this.a.build(), new EnumMap<>($$0), this.c, this.e, this.f, this.d, this.g);
         }
      }
   }
}

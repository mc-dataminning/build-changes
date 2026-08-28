import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableList.Builder;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class hbx implements hbg {
   protected final List<gkn> a;
   protected final Map<jm, List<gkn>> b;
   protected final boolean c;
   protected final boolean d;
   protected final boolean e;
   protected final gze f;
   protected final gky g;

   public hbx(List<gkn> $$0, Map<jm, List<gkn>> $$1, boolean $$2, boolean $$3, boolean $$4, gze $$5, gky $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$4;
      this.e = $$3;
      this.f = $$5;
      this.g = $$6;
   }

   @Override
   public List<gkn> a(@Nullable dvv $$0, @Nullable jm $$1, azu $$2) {
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
   public gze e() {
      return this.f;
   }

   @Override
   public gky f() {
      return this.g;
   }

   public static class a {
      private final Builder<gkn> a = ImmutableList.builder();
      private final EnumMap<jm, Builder<gkn>> b = Maps.newEnumMap(jm.class);
      private final boolean c;
      @Nullable
      private gze d;
      private final boolean e;
      private final boolean f;
      private final gky g;

      public a(gks $$0, boolean $$1) {
         this($$0.b(), $$0.c().a(), $$1, $$0.g());
      }

      private a(boolean $$0, boolean $$1, boolean $$2, gky $$3) {
         this.c = $$0;
         this.e = $$1;
         this.f = $$2;
         this.g = $$3;

         for (jm $$4 : jm.values()) {
            this.b.put($$4, ImmutableList.builder());
         }
      }

      public hbx.a a(jm $$0, gkn $$1) {
         this.b.get($$0).add($$1);
         return this;
      }

      public hbx.a a(gkn $$0) {
         this.a.add($$0);
         return this;
      }

      public hbx.a a(gze $$0) {
         this.d = $$0;
         return this;
      }

      public hbx.a a() {
         return this;
      }

      public hbg b() {
         if (this.d == null) {
            throw new RuntimeException("Missing particle!");
         } else {
            Map<jm, List<gkn>> $$0 = Maps.transformValues(this.b, Builder::build);
            return new hbx(this.a.build(), new EnumMap<>($$0), this.c, this.e, this.f, this.d, this.g);
         }
      }
   }
}

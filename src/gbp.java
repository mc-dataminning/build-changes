import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class gbp implements gbf {
   protected final List<fpb> a;
   protected final Map<hc, List<fpb>> b;
   protected final boolean c;
   protected final boolean d;
   protected final boolean e;
   protected final fze f;
   protected final fpn g;
   protected final fpl h;

   public gbp(List<fpb> $$0, Map<hc, List<fpb>> $$1, boolean $$2, boolean $$3, boolean $$4, fze $$5, fpn $$6, fpl $$7) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$4;
      this.e = $$3;
      this.f = $$5;
      this.g = $$6;
      this.h = $$7;
   }

   @Override
   public List<fpb> a(@Nullable dfj $$0, @Nullable hc $$1, asc $$2) {
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
   public fze e() {
      return this.f;
   }

   @Override
   public fpn f() {
      return this.g;
   }

   @Override
   public fpl g() {
      return this.h;
   }

   public static class a {
      private final List<fpb> a = Lists.newArrayList();
      private final Map<hc, List<fpb>> b = Maps.newEnumMap(hc.class);
      private final fpl c;
      private final boolean d;
      private fze e;
      private final boolean f;
      private final boolean g;
      private final fpn h;

      public a(fpg $$0, fpl $$1, boolean $$2) {
         this($$0.b(), $$0.c().a(), $$2, $$0.h(), $$1);
      }

      private a(boolean $$0, boolean $$1, boolean $$2, fpn $$3, fpl $$4) {
         for (hc $$5 : hc.values()) {
            this.b.put($$5, Lists.newArrayList());
         }

         this.c = $$4;
         this.d = $$0;
         this.f = $$1;
         this.g = $$2;
         this.h = $$3;
      }

      public gbp.a a(hc $$0, fpb $$1) {
         this.b.get($$0).add($$1);
         return this;
      }

      public gbp.a a(fpb $$0) {
         this.a.add($$0);
         return this;
      }

      public gbp.a a(fze $$0) {
         this.e = $$0;
         return this;
      }

      public gbp.a a() {
         return this;
      }

      public gbf b() {
         if (this.e == null) {
            throw new RuntimeException("Missing particle!");
         } else {
            return new gbp(this.a, this.b, this.d, this.f, this.g, this.e, this.h, this.c);
         }
      }
   }
}

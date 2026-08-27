import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class gbr implements gbh {
   protected final List<fpd> a;
   protected final Map<hc, List<fpd>> b;
   protected final boolean c;
   protected final boolean d;
   protected final boolean e;
   protected final fzg f;
   protected final fpp g;
   protected final fpn h;

   public gbr(List<fpd> $$0, Map<hc, List<fpd>> $$1, boolean $$2, boolean $$3, boolean $$4, fzg $$5, fpp $$6, fpn $$7) {
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
   public List<fpd> a(@Nullable dfl $$0, @Nullable hc $$1, ase $$2) {
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
   public fzg e() {
      return this.f;
   }

   @Override
   public fpp f() {
      return this.g;
   }

   @Override
   public fpn g() {
      return this.h;
   }

   public static class a {
      private final List<fpd> a = Lists.newArrayList();
      private final Map<hc, List<fpd>> b = Maps.newEnumMap(hc.class);
      private final fpn c;
      private final boolean d;
      private fzg e;
      private final boolean f;
      private final boolean g;
      private final fpp h;

      public a(fpi $$0, fpn $$1, boolean $$2) {
         this($$0.b(), $$0.c().a(), $$2, $$0.h(), $$1);
      }

      private a(boolean $$0, boolean $$1, boolean $$2, fpp $$3, fpn $$4) {
         for (hc $$5 : hc.values()) {
            this.b.put($$5, Lists.newArrayList());
         }

         this.c = $$4;
         this.d = $$0;
         this.f = $$1;
         this.g = $$2;
         this.h = $$3;
      }

      public gbr.a a(hc $$0, fpd $$1) {
         this.b.get($$0).add($$1);
         return this;
      }

      public gbr.a a(fpd $$0) {
         this.a.add($$0);
         return this;
      }

      public gbr.a a(fzg $$0) {
         this.e = $$0;
         return this;
      }

      public gbr.a a() {
         return this;
      }

      public gbh b() {
         if (this.e == null) {
            throw new RuntimeException("Missing particle!");
         } else {
            return new gbr(this.a, this.b, this.d, this.f, this.g, this.e, this.h, this.c);
         }
      }
   }
}

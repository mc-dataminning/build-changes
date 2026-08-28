import com.google.common.hash.HashCode;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.annotation.Nullable;

public class grs {
   private final grp a;
   final grq b;
   private final grr c;
   private final Runnable d;
   private grs.c e;
   final List<grs.e> f = new ArrayList<>();

   public grs(grp $$0, grq $$1, grr $$2, Runnable $$3, grs.c $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
   }

   void f() {
      this.d.run();
   }

   private void b(UUID $$0) {
      for (grs.e $$1 : this.f) {
         if ($$1.a.equals($$0)) {
            $$1.a(grs.d.f);
         }
      }
   }

   public void a(UUID $$0, URL $$1, @Nullable HashCode $$2) {
      if (this.e == grs.c.c) {
         this.b.a($$0, grq.a.a);
      } else {
         this.a($$0, new grs.e($$0, $$1, $$2));
      }
   }

   public void a(UUID $$0, Path $$1) {
      if (this.e == grs.c.c) {
         this.b.a($$0, grq.a.a);
      } else {
         URL $$2;
         try {
            $$2 = $$1.toUri().toURL();
         } catch (MalformedURLException var5) {
            throw new IllegalStateException("Can't convert path to URL " + $$1, var5);
         }

         grs.e $$5 = new grs.e($$0, $$2, null);
         $$5.f = grs.b.c;
         $$5.d = $$1;
         this.a($$0, $$5);
      }
   }

   private void a(UUID $$0, grs.e $$1) {
      this.b($$0);
      this.f.add($$1);
      if (this.e == grs.c.b) {
         this.a($$1);
      }

      this.f();
   }

   private void a(grs.e $$0) {
      this.b.a($$0.a, grq.b.a);
      $$0.h = true;
   }

   @Nullable
   private grs.e c(UUID $$0) {
      for (grs.e $$1 : this.f) {
         if (!$$1.a() && $$1.a.equals($$0)) {
            return $$1;
         }
      }

      return null;
   }

   public void a(UUID $$0) {
      grs.e $$1 = this.c($$0);
      if ($$1 != null) {
         $$1.a(grs.d.e);
         this.f();
      }
   }

   public void a() {
      for (grs.e $$0 : this.f) {
         $$0.a(grs.d.e);
      }

      this.f();
   }

   public void b() {
      this.e = grs.c.b;

      for (grs.e $$0 : this.f) {
         if (!$$0.h && !$$0.a()) {
            this.a($$0);
         }
      }

      this.f();
   }

   public void c() {
      this.e = grs.c.c;

      for (grs.e $$0 : this.f) {
         if (!$$0.h) {
            $$0.a(grs.d.c);
         }
      }

      this.f();
   }

   public void d() {
      this.e = grs.c.a;
   }

   public void e() {
      boolean $$0 = this.h();
      if (!$$0) {
         this.i();
      }

      this.g();
   }

   private void g() {
      this.f.removeIf($$0 -> {
         if ($$0.g != grs.a.a) {
            return false;
         } else if ($$0.e != null) {
            grq.a $$1 = $$0.e.g;
            if ($$1 != null) {
               this.b.a($$0.a, $$1);
            }

            return true;
         } else {
            return false;
         }
      });
   }

   private void a(Collection<grs.e> $$0, asv.b $$1) {
      if (!$$1.b().isEmpty()) {
         for (grs.e $$2 : this.f) {
            if ($$2.g != grs.a.c) {
               if ($$1.b().contains($$2.a)) {
                  $$2.a(grs.d.a);
               } else {
                  $$2.a(grs.d.d);
               }
            }
         }
      }

      for (grs.e $$3 : $$0) {
         Path $$4 = $$1.a().get($$3.a);
         if ($$4 != null) {
            $$3.f = grs.b.c;
            $$3.d = $$4;
            if (!$$3.a()) {
               this.b.a($$3.a, grq.b.b);
            }
         }
      }

      this.f();
   }

   private boolean h() {
      List<grs.e> $$0 = new ArrayList<>();
      boolean $$1 = false;

      for (grs.e $$2 : this.f) {
         if (!$$2.a() && $$2.h) {
            if ($$2.f != grs.b.c) {
               $$1 = true;
            }

            if ($$2.f == grs.b.a) {
               $$2.f = grs.b.b;
               $$0.add($$2);
            }
         }
      }

      if (!$$0.isEmpty()) {
         Map<UUID, asv.c> $$3 = new HashMap<>();

         for (grs.e $$4 : $$0) {
            $$3.put($$4.a, new asv.c($$4.b, $$4.c));
         }

         this.a.a($$3, $$1x -> this.a($$0, $$1x));
      }

      return $$1;
   }

   private void i() {
      boolean $$0 = false;
      final List<grs.e> $$1 = new ArrayList<>();
      final List<grs.e> $$2 = new ArrayList<>();

      for (grs.e $$3 : this.f) {
         if ($$3.g == grs.a.b) {
            return;
         }

         boolean $$4 = $$3.h && $$3.f == grs.b.c && !$$3.a();
         if ($$4 && $$3.g == grs.a.a) {
            $$1.add($$3);
            $$0 = true;
         }

         if ($$3.g == grs.a.c) {
            if (!$$4) {
               $$0 = true;
               $$2.add($$3);
            } else {
               $$1.add($$3);
            }
         }
      }

      if ($$0) {
         for (grs.e $$5 : $$1) {
            if ($$5.g != grs.a.c) {
               $$5.g = grs.a.b;
            }
         }

         for (grs.e $$6 : $$2) {
            $$6.g = grs.a.b;
         }

         this.c.scheduleReload(new grr.a() {
            @Override
            public void a() {
               for (grs.e $$0 : $$1) {
                  $$0.g = grs.a.c;
                  if ($$0.e == null) {
                     grs.this.b.a($$0.a, grq.a.b);
                  }
               }

               for (grs.e $$1 : $$2) {
                  $$1.g = grs.a.a;
               }

               grs.this.f();
            }

            @Override
            public void a(boolean $$0) {
               if (!$$0) {
                  $$1.clear();

                  for (grs.e $$1 : grs.this.f) {
                     switch ($$1.g) {
                        case a:
                           $$1.a(grs.d.d);
                           break;
                        case b:
                           $$1.g = grs.a.a;
                           $$1.a(grs.d.b);
                           break;
                        case c:
                           $$1.add($$1);
                     }
                  }

                  grs.this.f();
               } else {
                  for (grs.e $$2 : grs.this.f) {
                     if ($$2.g == grs.a.b) {
                        $$2.g = grs.a.a;
                     }
                  }
               }
            }

            @Override
            public List<grr.b> b() {
               return $$1.stream().map($$0 -> new grr.b($$0.a, $$0.d)).toList();
            }
         });
      }
   }

   static enum a {
      a,
      b,
      c;
   }

   static enum b {
      a,
      b,
      c;
   }

   public static enum c {
      a,
      b,
      c;
   }

   static enum d {
      a(grq.a.d),
      b(grq.a.e),
      c(grq.a.a),
      d(grq.a.c),
      e(null),
      f(null);

      @Nullable
      final grq.a g;

      private d(@Nullable final grq.a $$0) {
         this.g = $$0;
      }
   }

   static class e {
      final UUID a;
      final URL b;
      @Nullable
      final HashCode c;
      @Nullable
      Path d;
      @Nullable
      grs.d e;
      grs.b f = grs.b.a;
      grs.a g = grs.a.a;
      boolean h;

      e(UUID $$0, URL $$1, @Nullable HashCode $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public void a(grs.d $$0) {
         if (this.e == null) {
            this.e = $$0;
         }
      }

      public boolean a() {
         return this.e != null;
      }
   }
}

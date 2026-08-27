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

public class gph {
   private final gpe a;
   final gpf b;
   private final gpg c;
   private final Runnable d;
   private gph.c e;
   final List<gph.e> f = new ArrayList<>();

   public gph(gpe $$0, gpf $$1, gpg $$2, Runnable $$3, gph.c $$4) {
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
      for (gph.e $$1 : this.f) {
         if ($$1.a.equals($$0)) {
            $$1.a(gph.d.f);
         }
      }
   }

   public void a(UUID $$0, URL $$1, @Nullable HashCode $$2) {
      if (this.e == gph.c.c) {
         this.b.a($$0, gpf.a.a);
      } else {
         this.a($$0, new gph.e($$0, $$1, $$2));
      }
   }

   public void a(UUID $$0, Path $$1) {
      if (this.e == gph.c.c) {
         this.b.a($$0, gpf.a.a);
      } else {
         URL $$2;
         try {
            $$2 = $$1.toUri().toURL();
         } catch (MalformedURLException var5) {
            throw new IllegalStateException("Can't convert path to URL " + $$1, var5);
         }

         gph.e $$5 = new gph.e($$0, $$2, null);
         $$5.f = gph.b.c;
         $$5.d = $$1;
         this.a($$0, $$5);
      }
   }

   private void a(UUID $$0, gph.e $$1) {
      this.b($$0);
      this.f.add($$1);
      if (this.e == gph.c.b) {
         this.a($$1);
      }

      this.f();
   }

   private void a(gph.e $$0) {
      this.b.a($$0.a, gpf.b.a);
      $$0.h = true;
   }

   @Nullable
   private gph.e c(UUID $$0) {
      for (gph.e $$1 : this.f) {
         if (!$$1.a() && $$1.a.equals($$0)) {
            return $$1;
         }
      }

      return null;
   }

   public void a(UUID $$0) {
      gph.e $$1 = this.c($$0);
      if ($$1 != null) {
         $$1.a(gph.d.e);
         this.f();
      }
   }

   public void a() {
      for (gph.e $$0 : this.f) {
         $$0.a(gph.d.e);
      }

      this.f();
   }

   public void b() {
      this.e = gph.c.b;

      for (gph.e $$0 : this.f) {
         if (!$$0.h && !$$0.a()) {
            this.a($$0);
         }
      }

      this.f();
   }

   public void c() {
      this.e = gph.c.c;

      for (gph.e $$0 : this.f) {
         if (!$$0.h) {
            $$0.a(gph.d.c);
         }
      }

      this.f();
   }

   public void d() {
      this.e = gph.c.a;
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
         if ($$0.g != gph.a.a) {
            return false;
         } else if ($$0.e != null) {
            gpf.a $$1 = $$0.e.g;
            if ($$1 != null) {
               this.b.a($$0.a, $$1);
            }

            return true;
         } else {
            return false;
         }
      });
   }

   private void a(Collection<gph.e> $$0, arv.b $$1) {
      if (!$$1.b().isEmpty()) {
         for (gph.e $$2 : this.f) {
            if ($$2.g != gph.a.c) {
               if ($$1.b().contains($$2.a)) {
                  $$2.a(gph.d.a);
               } else {
                  $$2.a(gph.d.d);
               }
            }
         }
      }

      for (gph.e $$3 : $$0) {
         Path $$4 = $$1.a().get($$3.a);
         if ($$4 != null) {
            $$3.f = gph.b.c;
            $$3.d = $$4;
            if (!$$3.a()) {
               this.b.a($$3.a, gpf.b.b);
            }
         }
      }

      this.f();
   }

   private boolean h() {
      List<gph.e> $$0 = new ArrayList<>();
      boolean $$1 = false;

      for (gph.e $$2 : this.f) {
         if (!$$2.a() && $$2.h) {
            if ($$2.f != gph.b.c) {
               $$1 = true;
            }

            if ($$2.f == gph.b.a) {
               $$2.f = gph.b.b;
               $$0.add($$2);
            }
         }
      }

      if (!$$0.isEmpty()) {
         Map<UUID, arv.c> $$3 = new HashMap<>();

         for (gph.e $$4 : $$0) {
            $$3.put($$4.a, new arv.c($$4.b, $$4.c));
         }

         this.a.a($$3, $$1x -> this.a($$0, $$1x));
      }

      return $$1;
   }

   private void i() {
      boolean $$0 = false;
      final List<gph.e> $$1 = new ArrayList<>();
      final List<gph.e> $$2 = new ArrayList<>();

      for (gph.e $$3 : this.f) {
         if ($$3.g == gph.a.b) {
            return;
         }

         boolean $$4 = $$3.h && $$3.f == gph.b.c && !$$3.a();
         if ($$4 && $$3.g == gph.a.a) {
            $$1.add($$3);
            $$0 = true;
         }

         if ($$3.g == gph.a.c) {
            if (!$$4) {
               $$0 = true;
               $$2.add($$3);
            } else {
               $$1.add($$3);
            }
         }
      }

      if ($$0) {
         for (gph.e $$5 : $$1) {
            if ($$5.g != gph.a.c) {
               $$5.g = gph.a.b;
            }
         }

         for (gph.e $$6 : $$2) {
            $$6.g = gph.a.b;
         }

         this.c.scheduleReload(new gpg.a() {
            @Override
            public void a() {
               for (gph.e $$0 : $$1) {
                  $$0.g = gph.a.c;
                  if ($$0.e == null) {
                     gph.this.b.a($$0.a, gpf.a.b);
                  }
               }

               for (gph.e $$1 : $$2) {
                  $$1.g = gph.a.a;
               }

               gph.this.f();
            }

            @Override
            public void a(boolean $$0) {
               if (!$$0) {
                  $$1.clear();

                  for (gph.e $$1 : gph.this.f) {
                     switch ($$1.g) {
                        case c:
                           $$1.add($$1);
                           break;
                        case b:
                           $$1.g = gph.a.a;
                           $$1.a(gph.d.b);
                           break;
                        case a:
                           $$1.a(gph.d.d);
                     }
                  }

                  gph.this.f();
               } else {
                  for (gph.e $$2 : gph.this.f) {
                     if ($$2.g == gph.a.b) {
                        $$2.g = gph.a.a;
                     }
                  }
               }
            }

            @Override
            public List<gpg.b> b() {
               return $$1.stream().map($$0 -> new gpg.b($$0.a, $$0.d)).toList();
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
      a(gpf.a.d),
      b(gpf.a.e),
      c(gpf.a.a),
      d(gpf.a.c),
      e(null),
      f(null);

      @Nullable
      final gpf.a g;

      private d(@Nullable gpf.a $$0) {
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
      gph.d e;
      gph.b f = gph.b.a;
      gph.a g = gph.a.a;
      boolean h;

      e(UUID $$0, URL $$1, @Nullable HashCode $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public void a(gph.d $$0) {
         if (this.e == null) {
            this.e = $$0;
         }
      }

      public boolean a() {
         return this.e != null;
      }
   }
}

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

public class gps {
   private final gpp a;
   final gpq b;
   private final gpr c;
   private final Runnable d;
   private gps.c e;
   final List<gps.e> f = new ArrayList<>();

   public gps(gpp $$0, gpq $$1, gpr $$2, Runnable $$3, gps.c $$4) {
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
      for (gps.e $$1 : this.f) {
         if ($$1.a.equals($$0)) {
            $$1.a(gps.d.f);
         }
      }
   }

   public void a(UUID $$0, URL $$1, @Nullable HashCode $$2) {
      if (this.e == gps.c.c) {
         this.b.a($$0, gpq.a.a);
      } else {
         this.a($$0, new gps.e($$0, $$1, $$2));
      }
   }

   public void a(UUID $$0, Path $$1) {
      if (this.e == gps.c.c) {
         this.b.a($$0, gpq.a.a);
      } else {
         URL $$2;
         try {
            $$2 = $$1.toUri().toURL();
         } catch (MalformedURLException var5) {
            throw new IllegalStateException("Can't convert path to URL " + $$1, var5);
         }

         gps.e $$5 = new gps.e($$0, $$2, null);
         $$5.f = gps.b.c;
         $$5.d = $$1;
         this.a($$0, $$5);
      }
   }

   private void a(UUID $$0, gps.e $$1) {
      this.b($$0);
      this.f.add($$1);
      if (this.e == gps.c.b) {
         this.a($$1);
      }

      this.f();
   }

   private void a(gps.e $$0) {
      this.b.a($$0.a, gpq.b.a);
      $$0.h = true;
   }

   @Nullable
   private gps.e c(UUID $$0) {
      for (gps.e $$1 : this.f) {
         if (!$$1.a() && $$1.a.equals($$0)) {
            return $$1;
         }
      }

      return null;
   }

   public void a(UUID $$0) {
      gps.e $$1 = this.c($$0);
      if ($$1 != null) {
         $$1.a(gps.d.e);
         this.f();
      }
   }

   public void a() {
      for (gps.e $$0 : this.f) {
         $$0.a(gps.d.e);
      }

      this.f();
   }

   public void b() {
      this.e = gps.c.b;

      for (gps.e $$0 : this.f) {
         if (!$$0.h && !$$0.a()) {
            this.a($$0);
         }
      }

      this.f();
   }

   public void c() {
      this.e = gps.c.c;

      for (gps.e $$0 : this.f) {
         if (!$$0.h) {
            $$0.a(gps.d.c);
         }
      }

      this.f();
   }

   public void d() {
      this.e = gps.c.a;
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
         if ($$0.g != gps.a.a) {
            return false;
         } else if ($$0.e != null) {
            gpq.a $$1 = $$0.e.g;
            if ($$1 != null) {
               this.b.a($$0.a, $$1);
            }

            return true;
         } else {
            return false;
         }
      });
   }

   private void a(Collection<gps.e> $$0, ary.b $$1) {
      if (!$$1.b().isEmpty()) {
         for (gps.e $$2 : this.f) {
            if ($$2.g != gps.a.c) {
               if ($$1.b().contains($$2.a)) {
                  $$2.a(gps.d.a);
               } else {
                  $$2.a(gps.d.d);
               }
            }
         }
      }

      for (gps.e $$3 : $$0) {
         Path $$4 = $$1.a().get($$3.a);
         if ($$4 != null) {
            $$3.f = gps.b.c;
            $$3.d = $$4;
            if (!$$3.a()) {
               this.b.a($$3.a, gpq.b.b);
            }
         }
      }

      this.f();
   }

   private boolean h() {
      List<gps.e> $$0 = new ArrayList<>();
      boolean $$1 = false;

      for (gps.e $$2 : this.f) {
         if (!$$2.a() && $$2.h) {
            if ($$2.f != gps.b.c) {
               $$1 = true;
            }

            if ($$2.f == gps.b.a) {
               $$2.f = gps.b.b;
               $$0.add($$2);
            }
         }
      }

      if (!$$0.isEmpty()) {
         Map<UUID, ary.c> $$3 = new HashMap<>();

         for (gps.e $$4 : $$0) {
            $$3.put($$4.a, new ary.c($$4.b, $$4.c));
         }

         this.a.a($$3, $$1x -> this.a($$0, $$1x));
      }

      return $$1;
   }

   private void i() {
      boolean $$0 = false;
      final List<gps.e> $$1 = new ArrayList<>();
      final List<gps.e> $$2 = new ArrayList<>();

      for (gps.e $$3 : this.f) {
         if ($$3.g == gps.a.b) {
            return;
         }

         boolean $$4 = $$3.h && $$3.f == gps.b.c && !$$3.a();
         if ($$4 && $$3.g == gps.a.a) {
            $$1.add($$3);
            $$0 = true;
         }

         if ($$3.g == gps.a.c) {
            if (!$$4) {
               $$0 = true;
               $$2.add($$3);
            } else {
               $$1.add($$3);
            }
         }
      }

      if ($$0) {
         for (gps.e $$5 : $$1) {
            if ($$5.g != gps.a.c) {
               $$5.g = gps.a.b;
            }
         }

         for (gps.e $$6 : $$2) {
            $$6.g = gps.a.b;
         }

         this.c.scheduleReload(new gpr.a() {
            @Override
            public void a() {
               for (gps.e $$0 : $$1) {
                  $$0.g = gps.a.c;
                  if ($$0.e == null) {
                     gps.this.b.a($$0.a, gpq.a.b);
                  }
               }

               for (gps.e $$1 : $$2) {
                  $$1.g = gps.a.a;
               }

               gps.this.f();
            }

            @Override
            public void a(boolean $$0) {
               if (!$$0) {
                  $$1.clear();

                  for (gps.e $$1 : gps.this.f) {
                     switch ($$1.g) {
                        case c:
                           $$1.add($$1);
                           break;
                        case b:
                           $$1.g = gps.a.a;
                           $$1.a(gps.d.b);
                           break;
                        case a:
                           $$1.a(gps.d.d);
                     }
                  }

                  gps.this.f();
               } else {
                  for (gps.e $$2 : gps.this.f) {
                     if ($$2.g == gps.a.b) {
                        $$2.g = gps.a.a;
                     }
                  }
               }
            }

            @Override
            public List<gpr.b> b() {
               return $$1.stream().map($$0 -> new gpr.b($$0.a, $$0.d)).toList();
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
      a(gpq.a.d),
      b(gpq.a.e),
      c(gpq.a.a),
      d(gpq.a.c),
      e(null),
      f(null);

      @Nullable
      final gpq.a g;

      private d(@Nullable gpq.a $$0) {
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
      gps.d e;
      gps.b f = gps.b.a;
      gps.a g = gps.a.a;
      boolean h;

      e(UUID $$0, URL $$1, @Nullable HashCode $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public void a(gps.d $$0) {
         if (this.e == null) {
            this.e = $$0;
         }
      }

      public boolean a() {
         return this.e != null;
      }
   }
}

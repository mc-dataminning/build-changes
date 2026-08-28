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

public class gsi {
   private final gsf a;
   final gsg b;
   private final gsh c;
   private final Runnable d;
   private gsi.c e;
   final List<gsi.e> f = new ArrayList<>();

   public gsi(gsf $$0, gsg $$1, gsh $$2, Runnable $$3, gsi.c $$4) {
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
      for (gsi.e $$1 : this.f) {
         if ($$1.a.equals($$0)) {
            $$1.a(gsi.d.f);
         }
      }
   }

   public void a(UUID $$0, URL $$1, @Nullable HashCode $$2) {
      if (this.e == gsi.c.c) {
         this.b.a($$0, gsg.a.a);
      } else {
         this.a($$0, new gsi.e($$0, $$1, $$2));
      }
   }

   public void a(UUID $$0, Path $$1) {
      if (this.e == gsi.c.c) {
         this.b.a($$0, gsg.a.a);
      } else {
         URL $$2;
         try {
            $$2 = $$1.toUri().toURL();
         } catch (MalformedURLException var5) {
            throw new IllegalStateException("Can't convert path to URL " + $$1, var5);
         }

         gsi.e $$5 = new gsi.e($$0, $$2, null);
         $$5.f = gsi.b.c;
         $$5.d = $$1;
         this.a($$0, $$5);
      }
   }

   private void a(UUID $$0, gsi.e $$1) {
      this.b($$0);
      this.f.add($$1);
      if (this.e == gsi.c.b) {
         this.a($$1);
      }

      this.f();
   }

   private void a(gsi.e $$0) {
      this.b.a($$0.a, gsg.b.a);
      $$0.h = true;
   }

   @Nullable
   private gsi.e c(UUID $$0) {
      for (gsi.e $$1 : this.f) {
         if (!$$1.a() && $$1.a.equals($$0)) {
            return $$1;
         }
      }

      return null;
   }

   public void a(UUID $$0) {
      gsi.e $$1 = this.c($$0);
      if ($$1 != null) {
         $$1.a(gsi.d.e);
         this.f();
      }
   }

   public void a() {
      for (gsi.e $$0 : this.f) {
         $$0.a(gsi.d.e);
      }

      this.f();
   }

   public void b() {
      this.e = gsi.c.b;

      for (gsi.e $$0 : this.f) {
         if (!$$0.h && !$$0.a()) {
            this.a($$0);
         }
      }

      this.f();
   }

   public void c() {
      this.e = gsi.c.c;

      for (gsi.e $$0 : this.f) {
         if (!$$0.h) {
            $$0.a(gsi.d.c);
         }
      }

      this.f();
   }

   public void d() {
      this.e = gsi.c.a;
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
         if ($$0.g != gsi.a.a) {
            return false;
         } else if ($$0.e != null) {
            gsg.a $$1 = $$0.e.g;
            if ($$1 != null) {
               this.b.a($$0.a, $$1);
            }

            return true;
         } else {
            return false;
         }
      });
   }

   private void a(Collection<gsi.e> $$0, asd.b $$1) {
      if (!$$1.b().isEmpty()) {
         for (gsi.e $$2 : this.f) {
            if ($$2.g != gsi.a.c) {
               if ($$1.b().contains($$2.a)) {
                  $$2.a(gsi.d.a);
               } else {
                  $$2.a(gsi.d.d);
               }
            }
         }
      }

      for (gsi.e $$3 : $$0) {
         Path $$4 = $$1.a().get($$3.a);
         if ($$4 != null) {
            $$3.f = gsi.b.c;
            $$3.d = $$4;
            if (!$$3.a()) {
               this.b.a($$3.a, gsg.b.b);
            }
         }
      }

      this.f();
   }

   private boolean h() {
      List<gsi.e> $$0 = new ArrayList<>();
      boolean $$1 = false;

      for (gsi.e $$2 : this.f) {
         if (!$$2.a() && $$2.h) {
            if ($$2.f != gsi.b.c) {
               $$1 = true;
            }

            if ($$2.f == gsi.b.a) {
               $$2.f = gsi.b.b;
               $$0.add($$2);
            }
         }
      }

      if (!$$0.isEmpty()) {
         Map<UUID, asd.c> $$3 = new HashMap<>();

         for (gsi.e $$4 : $$0) {
            $$3.put($$4.a, new asd.c($$4.b, $$4.c));
         }

         this.a.a($$3, $$1x -> this.a($$0, $$1x));
      }

      return $$1;
   }

   private void i() {
      boolean $$0 = false;
      final List<gsi.e> $$1 = new ArrayList<>();
      final List<gsi.e> $$2 = new ArrayList<>();

      for (gsi.e $$3 : this.f) {
         if ($$3.g == gsi.a.b) {
            return;
         }

         boolean $$4 = $$3.h && $$3.f == gsi.b.c && !$$3.a();
         if ($$4 && $$3.g == gsi.a.a) {
            $$1.add($$3);
            $$0 = true;
         }

         if ($$3.g == gsi.a.c) {
            if (!$$4) {
               $$0 = true;
               $$2.add($$3);
            } else {
               $$1.add($$3);
            }
         }
      }

      if ($$0) {
         for (gsi.e $$5 : $$1) {
            if ($$5.g != gsi.a.c) {
               $$5.g = gsi.a.b;
            }
         }

         for (gsi.e $$6 : $$2) {
            $$6.g = gsi.a.b;
         }

         this.c.scheduleReload(new gsh.a() {
            @Override
            public void a() {
               for (gsi.e $$0 : $$1) {
                  $$0.g = gsi.a.c;
                  if ($$0.e == null) {
                     gsi.this.b.a($$0.a, gsg.a.b);
                  }
               }

               for (gsi.e $$1 : $$2) {
                  $$1.g = gsi.a.a;
               }

               gsi.this.f();
            }

            @Override
            public void a(boolean $$0) {
               if (!$$0) {
                  $$1.clear();

                  for (gsi.e $$1 : gsi.this.f) {
                     switch ($$1.g) {
                        case a:
                           $$1.a(gsi.d.d);
                           break;
                        case b:
                           $$1.g = gsi.a.a;
                           $$1.a(gsi.d.b);
                           break;
                        case c:
                           $$1.add($$1);
                     }
                  }

                  gsi.this.f();
               } else {
                  for (gsi.e $$2 : gsi.this.f) {
                     if ($$2.g == gsi.a.b) {
                        $$2.g = gsi.a.a;
                     }
                  }
               }
            }

            @Override
            public List<gsh.b> b() {
               return $$1.stream().map($$0 -> new gsh.b($$0.a, $$0.d)).toList();
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
      a(gsg.a.d),
      b(gsg.a.e),
      c(gsg.a.a),
      d(gsg.a.c),
      e(null),
      f(null);

      @Nullable
      final gsg.a g;

      private d(@Nullable final gsg.a $$0) {
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
      gsi.d e;
      gsi.b f = gsi.b.a;
      gsi.a g = gsi.a.a;
      boolean h;

      e(UUID $$0, URL $$1, @Nullable HashCode $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public void a(gsi.d $$0) {
         if (this.e == null) {
            this.e = $$0;
         }
      }

      public boolean a() {
         return this.e != null;
      }
   }
}

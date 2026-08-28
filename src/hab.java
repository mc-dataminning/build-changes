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

public class hab {
   private final gzy a;
   final gzz b;
   private final haa c;
   private final Runnable d;
   private hab.c e;
   final List<hab.e> f = new ArrayList<>();

   public hab(gzy $$0, gzz $$1, haa $$2, Runnable $$3, hab.c $$4) {
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
      for (hab.e $$1 : this.f) {
         if ($$1.a.equals($$0)) {
            $$1.a(hab.d.f);
         }
      }
   }

   public void a(UUID $$0, URL $$1, @Nullable HashCode $$2) {
      if (this.e == hab.c.c) {
         this.b.a($$0, gzz.a.a);
      } else {
         this.a($$0, new hab.e($$0, $$1, $$2));
      }
   }

   public void a(UUID $$0, Path $$1) {
      if (this.e == hab.c.c) {
         this.b.a($$0, gzz.a.a);
      } else {
         URL $$2;
         try {
            $$2 = $$1.toUri().toURL();
         } catch (MalformedURLException var5) {
            throw new IllegalStateException("Can't convert path to URL " + $$1, var5);
         }

         hab.e $$5 = new hab.e($$0, $$2, null);
         $$5.f = hab.b.c;
         $$5.d = $$1;
         this.a($$0, $$5);
      }
   }

   private void a(UUID $$0, hab.e $$1) {
      this.b($$0);
      this.f.add($$1);
      if (this.e == hab.c.b) {
         this.a($$1);
      }

      this.f();
   }

   private void a(hab.e $$0) {
      this.b.a($$0.a, gzz.b.a);
      $$0.h = true;
   }

   @Nullable
   private hab.e c(UUID $$0) {
      for (hab.e $$1 : this.f) {
         if (!$$1.a() && $$1.a.equals($$0)) {
            return $$1;
         }
      }

      return null;
   }

   public void a(UUID $$0) {
      hab.e $$1 = this.c($$0);
      if ($$1 != null) {
         $$1.a(hab.d.e);
         this.f();
      }
   }

   public void a() {
      for (hab.e $$0 : this.f) {
         $$0.a(hab.d.e);
      }

      this.f();
   }

   public void b() {
      this.e = hab.c.b;

      for (hab.e $$0 : this.f) {
         if (!$$0.h && !$$0.a()) {
            this.a($$0);
         }
      }

      this.f();
   }

   public void c() {
      this.e = hab.c.c;

      for (hab.e $$0 : this.f) {
         if (!$$0.h) {
            $$0.a(hab.d.c);
         }
      }

      this.f();
   }

   public void d() {
      this.e = hab.c.a;
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
         if ($$0.g != hab.a.a) {
            return false;
         } else if ($$0.e != null) {
            gzz.a $$1 = $$0.e.g;
            if ($$1 != null) {
               this.b.a($$0.a, $$1);
            }

            return true;
         } else {
            return false;
         }
      });
   }

   private void a(Collection<hab.e> $$0, ata.b $$1) {
      if (!$$1.b().isEmpty()) {
         for (hab.e $$2 : this.f) {
            if ($$2.g != hab.a.c) {
               if ($$1.b().contains($$2.a)) {
                  $$2.a(hab.d.a);
               } else {
                  $$2.a(hab.d.d);
               }
            }
         }
      }

      for (hab.e $$3 : $$0) {
         Path $$4 = $$1.a().get($$3.a);
         if ($$4 != null) {
            $$3.f = hab.b.c;
            $$3.d = $$4;
            if (!$$3.a()) {
               this.b.a($$3.a, gzz.b.b);
            }
         }
      }

      this.f();
   }

   private boolean h() {
      List<hab.e> $$0 = new ArrayList<>();
      boolean $$1 = false;

      for (hab.e $$2 : this.f) {
         if (!$$2.a() && $$2.h) {
            if ($$2.f != hab.b.c) {
               $$1 = true;
            }

            if ($$2.f == hab.b.a) {
               $$2.f = hab.b.b;
               $$0.add($$2);
            }
         }
      }

      if (!$$0.isEmpty()) {
         Map<UUID, ata.c> $$3 = new HashMap<>();

         for (hab.e $$4 : $$0) {
            $$3.put($$4.a, new ata.c($$4.b, $$4.c));
         }

         this.a.a($$3, $$1x -> this.a($$0, $$1x));
      }

      return $$1;
   }

   private void i() {
      boolean $$0 = false;
      final List<hab.e> $$1 = new ArrayList<>();
      final List<hab.e> $$2 = new ArrayList<>();

      for (hab.e $$3 : this.f) {
         if ($$3.g == hab.a.b) {
            return;
         }

         boolean $$4 = $$3.h && $$3.f == hab.b.c && !$$3.a();
         if ($$4 && $$3.g == hab.a.a) {
            $$1.add($$3);
            $$0 = true;
         }

         if ($$3.g == hab.a.c) {
            if (!$$4) {
               $$0 = true;
               $$2.add($$3);
            } else {
               $$1.add($$3);
            }
         }
      }

      if ($$0) {
         for (hab.e $$5 : $$1) {
            if ($$5.g != hab.a.c) {
               $$5.g = hab.a.b;
            }
         }

         for (hab.e $$6 : $$2) {
            $$6.g = hab.a.b;
         }

         this.c.scheduleReload(new haa.a() {
            @Override
            public void a() {
               for (hab.e $$0 : $$1) {
                  $$0.g = hab.a.c;
                  if ($$0.e == null) {
                     hab.this.b.a($$0.a, gzz.a.b);
                  }
               }

               for (hab.e $$1 : $$2) {
                  $$1.g = hab.a.a;
               }

               hab.this.f();
            }

            @Override
            public void a(boolean $$0) {
               if (!$$0) {
                  $$1.clear();

                  for (hab.e $$1 : hab.this.f) {
                     switch ($$1.g) {
                        case a:
                           $$1.a(hab.d.d);
                           break;
                        case b:
                           $$1.g = hab.a.a;
                           $$1.a(hab.d.b);
                           break;
                        case c:
                           $$1.add($$1);
                     }
                  }

                  hab.this.f();
               } else {
                  for (hab.e $$2 : hab.this.f) {
                     if ($$2.g == hab.a.b) {
                        $$2.g = hab.a.a;
                     }
                  }
               }
            }

            @Override
            public List<haa.b> b() {
               return $$1.stream().map($$0 -> new haa.b($$0.a, $$0.d)).toList();
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
      a(gzz.a.d),
      b(gzz.a.e),
      c(gzz.a.a),
      d(gzz.a.c),
      e(null),
      f(null);

      @Nullable
      final gzz.a g;

      private d(@Nullable final gzz.a $$0) {
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
      hab.d e;
      hab.b f = hab.b.a;
      hab.a g = hab.a.a;
      boolean h;

      e(UUID $$0, URL $$1, @Nullable HashCode $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public void a(hab.d $$0) {
         if (this.e == null) {
            this.e = $$0;
         }
      }

      public boolean a() {
         return this.e != null;
      }
   }
}

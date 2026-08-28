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

public class hho {
   private final hhl a;
   final hhm b;
   private final hhn c;
   private final Runnable d;
   private hho.c e;
   final List<hho.e> f = new ArrayList<>();

   public hho(hhl $$0, hhm $$1, hhn $$2, Runnable $$3, hho.c $$4) {
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
      for (hho.e $$1 : this.f) {
         if ($$1.a.equals($$0)) {
            $$1.a(hho.d.f);
         }
      }
   }

   public void a(UUID $$0, URL $$1, @Nullable HashCode $$2) {
      if (this.e == hho.c.c) {
         this.b.a($$0, hhm.a.a);
      } else {
         this.a($$0, new hho.e($$0, $$1, $$2));
      }
   }

   public void a(UUID $$0, Path $$1) {
      if (this.e == hho.c.c) {
         this.b.a($$0, hhm.a.a);
      } else {
         URL $$2;
         try {
            $$2 = $$1.toUri().toURL();
         } catch (MalformedURLException var5) {
            throw new IllegalStateException("Can't convert path to URL " + $$1, var5);
         }

         hho.e $$5 = new hho.e($$0, $$2, null);
         $$5.f = hho.b.c;
         $$5.d = $$1;
         this.a($$0, $$5);
      }
   }

   private void a(UUID $$0, hho.e $$1) {
      this.b($$0);
      this.f.add($$1);
      if (this.e == hho.c.b) {
         this.a($$1);
      }

      this.f();
   }

   private void a(hho.e $$0) {
      this.b.a($$0.a, hhm.b.a);
      $$0.h = true;
   }

   @Nullable
   private hho.e c(UUID $$0) {
      for (hho.e $$1 : this.f) {
         if (!$$1.a() && $$1.a.equals($$0)) {
            return $$1;
         }
      }

      return null;
   }

   public void a(UUID $$0) {
      hho.e $$1 = this.c($$0);
      if ($$1 != null) {
         $$1.a(hho.d.e);
         this.f();
      }
   }

   public void a() {
      for (hho.e $$0 : this.f) {
         $$0.a(hho.d.e);
      }

      this.f();
   }

   public void b() {
      this.e = hho.c.b;

      for (hho.e $$0 : this.f) {
         if (!$$0.h && !$$0.a()) {
            this.a($$0);
         }
      }

      this.f();
   }

   public void c() {
      this.e = hho.c.c;

      for (hho.e $$0 : this.f) {
         if (!$$0.h) {
            $$0.a(hho.d.c);
         }
      }

      this.f();
   }

   public void d() {
      this.e = hho.c.a;
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
         if ($$0.g != hho.a.a) {
            return false;
         } else if ($$0.e != null) {
            hhm.a $$1 = $$0.e.g;
            if ($$1 != null) {
               this.b.a($$0.a, $$1);
            }

            return true;
         } else {
            return false;
         }
      });
   }

   private void a(Collection<hho.e> $$0, asw.b $$1) {
      if (!$$1.b().isEmpty()) {
         for (hho.e $$2 : this.f) {
            if ($$2.g != hho.a.c) {
               if ($$1.b().contains($$2.a)) {
                  $$2.a(hho.d.a);
               } else {
                  $$2.a(hho.d.d);
               }
            }
         }
      }

      for (hho.e $$3 : $$0) {
         Path $$4 = $$1.a().get($$3.a);
         if ($$4 != null) {
            $$3.f = hho.b.c;
            $$3.d = $$4;
            if (!$$3.a()) {
               this.b.a($$3.a, hhm.b.b);
            }
         }
      }

      this.f();
   }

   private boolean h() {
      List<hho.e> $$0 = new ArrayList<>();
      boolean $$1 = false;

      for (hho.e $$2 : this.f) {
         if (!$$2.a() && $$2.h) {
            if ($$2.f != hho.b.c) {
               $$1 = true;
            }

            if ($$2.f == hho.b.a) {
               $$2.f = hho.b.b;
               $$0.add($$2);
            }
         }
      }

      if (!$$0.isEmpty()) {
         Map<UUID, asw.c> $$3 = new HashMap<>();

         for (hho.e $$4 : $$0) {
            $$3.put($$4.a, new asw.c($$4.b, $$4.c));
         }

         this.a.a($$3, $$1x -> this.a($$0, $$1x));
      }

      return $$1;
   }

   private void i() {
      boolean $$0 = false;
      final List<hho.e> $$1 = new ArrayList<>();
      final List<hho.e> $$2 = new ArrayList<>();

      for (hho.e $$3 : this.f) {
         if ($$3.g == hho.a.b) {
            return;
         }

         boolean $$4 = $$3.h && $$3.f == hho.b.c && !$$3.a();
         if ($$4 && $$3.g == hho.a.a) {
            $$1.add($$3);
            $$0 = true;
         }

         if ($$3.g == hho.a.c) {
            if (!$$4) {
               $$0 = true;
               $$2.add($$3);
            } else {
               $$1.add($$3);
            }
         }
      }

      if ($$0) {
         for (hho.e $$5 : $$1) {
            if ($$5.g != hho.a.c) {
               $$5.g = hho.a.b;
            }
         }

         for (hho.e $$6 : $$2) {
            $$6.g = hho.a.b;
         }

         this.c.scheduleReload(new hhn.a() {
            @Override
            public void a() {
               for (hho.e $$0 : $$1) {
                  $$0.g = hho.a.c;
                  if ($$0.e == null) {
                     hho.this.b.a($$0.a, hhm.a.b);
                  }
               }

               for (hho.e $$1 : $$2) {
                  $$1.g = hho.a.a;
               }

               hho.this.f();
            }

            @Override
            public void a(boolean $$0) {
               if (!$$0) {
                  $$1.clear();

                  for (hho.e $$1 : hho.this.f) {
                     switch ($$1.g) {
                        case a:
                           $$1.a(hho.d.d);
                           break;
                        case b:
                           $$1.g = hho.a.a;
                           $$1.a(hho.d.b);
                           break;
                        case c:
                           $$1.add($$1);
                     }
                  }

                  hho.this.f();
               } else {
                  for (hho.e $$2 : hho.this.f) {
                     if ($$2.g == hho.a.b) {
                        $$2.g = hho.a.a;
                     }
                  }
               }
            }

            @Override
            public List<hhn.b> b() {
               return $$1.stream().map($$0 -> new hhn.b($$0.a, $$0.d)).toList();
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
      a(hhm.a.d),
      b(hhm.a.e),
      c(hhm.a.a),
      d(hhm.a.c),
      e(null),
      f(null);

      @Nullable
      final hhm.a g;

      private d(@Nullable final hhm.a $$0) {
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
      hho.d e;
      hho.b f = hho.b.a;
      hho.a g = hho.a.a;
      boolean h;

      e(UUID $$0, URL $$1, @Nullable HashCode $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public void a(hho.d $$0) {
         if (this.e == null) {
            this.e = $$0;
         }
      }

      public boolean a() {
         return this.e != null;
      }
   }
}

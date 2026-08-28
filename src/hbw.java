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

public class hbw {
   private final hbt a;
   final hbu b;
   private final hbv c;
   private final Runnable d;
   private hbw.c e;
   final List<hbw.e> f = new ArrayList<>();

   public hbw(hbt $$0, hbu $$1, hbv $$2, Runnable $$3, hbw.c $$4) {
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
      for (hbw.e $$1 : this.f) {
         if ($$1.a.equals($$0)) {
            $$1.a(hbw.d.f);
         }
      }
   }

   public void a(UUID $$0, URL $$1, @Nullable HashCode $$2) {
      if (this.e == hbw.c.c) {
         this.b.a($$0, hbu.a.a);
      } else {
         this.a($$0, new hbw.e($$0, $$1, $$2));
      }
   }

   public void a(UUID $$0, Path $$1) {
      if (this.e == hbw.c.c) {
         this.b.a($$0, hbu.a.a);
      } else {
         URL $$2;
         try {
            $$2 = $$1.toUri().toURL();
         } catch (MalformedURLException var5) {
            throw new IllegalStateException("Can't convert path to URL " + $$1, var5);
         }

         hbw.e $$5 = new hbw.e($$0, $$2, null);
         $$5.f = hbw.b.c;
         $$5.d = $$1;
         this.a($$0, $$5);
      }
   }

   private void a(UUID $$0, hbw.e $$1) {
      this.b($$0);
      this.f.add($$1);
      if (this.e == hbw.c.b) {
         this.a($$1);
      }

      this.f();
   }

   private void a(hbw.e $$0) {
      this.b.a($$0.a, hbu.b.a);
      $$0.h = true;
   }

   @Nullable
   private hbw.e c(UUID $$0) {
      for (hbw.e $$1 : this.f) {
         if (!$$1.a() && $$1.a.equals($$0)) {
            return $$1;
         }
      }

      return null;
   }

   public void a(UUID $$0) {
      hbw.e $$1 = this.c($$0);
      if ($$1 != null) {
         $$1.a(hbw.d.e);
         this.f();
      }
   }

   public void a() {
      for (hbw.e $$0 : this.f) {
         $$0.a(hbw.d.e);
      }

      this.f();
   }

   public void b() {
      this.e = hbw.c.b;

      for (hbw.e $$0 : this.f) {
         if (!$$0.h && !$$0.a()) {
            this.a($$0);
         }
      }

      this.f();
   }

   public void c() {
      this.e = hbw.c.c;

      for (hbw.e $$0 : this.f) {
         if (!$$0.h) {
            $$0.a(hbw.d.c);
         }
      }

      this.f();
   }

   public void d() {
      this.e = hbw.c.a;
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
         if ($$0.g != hbw.a.a) {
            return false;
         } else if ($$0.e != null) {
            hbu.a $$1 = $$0.e.g;
            if ($$1 != null) {
               this.b.a($$0.a, $$1);
            }

            return true;
         } else {
            return false;
         }
      });
   }

   private void a(Collection<hbw.e> $$0, atk.b $$1) {
      if (!$$1.b().isEmpty()) {
         for (hbw.e $$2 : this.f) {
            if ($$2.g != hbw.a.c) {
               if ($$1.b().contains($$2.a)) {
                  $$2.a(hbw.d.a);
               } else {
                  $$2.a(hbw.d.d);
               }
            }
         }
      }

      for (hbw.e $$3 : $$0) {
         Path $$4 = $$1.a().get($$3.a);
         if ($$4 != null) {
            $$3.f = hbw.b.c;
            $$3.d = $$4;
            if (!$$3.a()) {
               this.b.a($$3.a, hbu.b.b);
            }
         }
      }

      this.f();
   }

   private boolean h() {
      List<hbw.e> $$0 = new ArrayList<>();
      boolean $$1 = false;

      for (hbw.e $$2 : this.f) {
         if (!$$2.a() && $$2.h) {
            if ($$2.f != hbw.b.c) {
               $$1 = true;
            }

            if ($$2.f == hbw.b.a) {
               $$2.f = hbw.b.b;
               $$0.add($$2);
            }
         }
      }

      if (!$$0.isEmpty()) {
         Map<UUID, atk.c> $$3 = new HashMap<>();

         for (hbw.e $$4 : $$0) {
            $$3.put($$4.a, new atk.c($$4.b, $$4.c));
         }

         this.a.a($$3, $$1x -> this.a($$0, $$1x));
      }

      return $$1;
   }

   private void i() {
      boolean $$0 = false;
      final List<hbw.e> $$1 = new ArrayList<>();
      final List<hbw.e> $$2 = new ArrayList<>();

      for (hbw.e $$3 : this.f) {
         if ($$3.g == hbw.a.b) {
            return;
         }

         boolean $$4 = $$3.h && $$3.f == hbw.b.c && !$$3.a();
         if ($$4 && $$3.g == hbw.a.a) {
            $$1.add($$3);
            $$0 = true;
         }

         if ($$3.g == hbw.a.c) {
            if (!$$4) {
               $$0 = true;
               $$2.add($$3);
            } else {
               $$1.add($$3);
            }
         }
      }

      if ($$0) {
         for (hbw.e $$5 : $$1) {
            if ($$5.g != hbw.a.c) {
               $$5.g = hbw.a.b;
            }
         }

         for (hbw.e $$6 : $$2) {
            $$6.g = hbw.a.b;
         }

         this.c.scheduleReload(new hbv.a() {
            @Override
            public void a() {
               for (hbw.e $$0 : $$1) {
                  $$0.g = hbw.a.c;
                  if ($$0.e == null) {
                     hbw.this.b.a($$0.a, hbu.a.b);
                  }
               }

               for (hbw.e $$1 : $$2) {
                  $$1.g = hbw.a.a;
               }

               hbw.this.f();
            }

            @Override
            public void a(boolean $$0) {
               if (!$$0) {
                  $$1.clear();

                  for (hbw.e $$1 : hbw.this.f) {
                     switch ($$1.g) {
                        case a:
                           $$1.a(hbw.d.d);
                           break;
                        case b:
                           $$1.g = hbw.a.a;
                           $$1.a(hbw.d.b);
                           break;
                        case c:
                           $$1.add($$1);
                     }
                  }

                  hbw.this.f();
               } else {
                  for (hbw.e $$2 : hbw.this.f) {
                     if ($$2.g == hbw.a.b) {
                        $$2.g = hbw.a.a;
                     }
                  }
               }
            }

            @Override
            public List<hbv.b> b() {
               return $$1.stream().map($$0 -> new hbv.b($$0.a, $$0.d)).toList();
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
      a(hbu.a.d),
      b(hbu.a.e),
      c(hbu.a.a),
      d(hbu.a.c),
      e(null),
      f(null);

      @Nullable
      final hbu.a g;

      private d(@Nullable final hbu.a $$0) {
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
      hbw.d e;
      hbw.b f = hbw.b.a;
      hbw.a g = hbw.a.a;
      boolean h;

      e(UUID $$0, URL $$1, @Nullable HashCode $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public void a(hbw.d $$0) {
         if (this.e == null) {
            this.e = $$0;
         }
      }

      public boolean a() {
         return this.e != null;
      }
   }
}

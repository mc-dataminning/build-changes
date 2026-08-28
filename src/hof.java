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

public class hof {
   private final hoc a;
   final hod b;
   private final hoe c;
   private final Runnable d;
   private hof.c e;
   final List<hof.e> f = new ArrayList<>();

   public hof(hoc $$0, hod $$1, hoe $$2, Runnable $$3, hof.c $$4) {
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
      for (hof.e $$1 : this.f) {
         if ($$1.a.equals($$0)) {
            $$1.a(hof.d.f);
         }
      }
   }

   public void a(UUID $$0, URL $$1, @Nullable HashCode $$2) {
      if (this.e == hof.c.c) {
         this.b.a($$0, hod.a.a);
      } else {
         this.a($$0, new hof.e($$0, $$1, $$2));
      }
   }

   public void a(UUID $$0, Path $$1) {
      if (this.e == hof.c.c) {
         this.b.a($$0, hod.a.a);
      } else {
         URL $$2;
         try {
            $$2 = $$1.toUri().toURL();
         } catch (MalformedURLException var5) {
            throw new IllegalStateException("Can't convert path to URL " + $$1, var5);
         }

         hof.e $$5 = new hof.e($$0, $$2, null);
         $$5.f = hof.b.c;
         $$5.d = $$1;
         this.a($$0, $$5);
      }
   }

   private void a(UUID $$0, hof.e $$1) {
      this.b($$0);
      this.f.add($$1);
      if (this.e == hof.c.b) {
         this.a($$1);
      }

      this.f();
   }

   private void a(hof.e $$0) {
      this.b.a($$0.a, hod.b.a);
      $$0.h = true;
   }

   @Nullable
   private hof.e c(UUID $$0) {
      for (hof.e $$1 : this.f) {
         if (!$$1.a() && $$1.a.equals($$0)) {
            return $$1;
         }
      }

      return null;
   }

   public void a(UUID $$0) {
      hof.e $$1 = this.c($$0);
      if ($$1 != null) {
         $$1.a(hof.d.e);
         this.f();
      }
   }

   public void a() {
      for (hof.e $$0 : this.f) {
         $$0.a(hof.d.e);
      }

      this.f();
   }

   public void b() {
      this.e = hof.c.b;

      for (hof.e $$0 : this.f) {
         if (!$$0.h && !$$0.a()) {
            this.a($$0);
         }
      }

      this.f();
   }

   public void c() {
      this.e = hof.c.c;

      for (hof.e $$0 : this.f) {
         if (!$$0.h) {
            $$0.a(hof.d.c);
         }
      }

      this.f();
   }

   public void d() {
      this.e = hof.c.a;
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
         if ($$0.g != hof.a.a) {
            return false;
         } else if ($$0.e != null) {
            hod.a $$1 = $$0.e.g;
            if ($$1 != null) {
               this.b.a($$0.a, $$1);
            }

            return true;
         } else {
            return false;
         }
      });
   }

   private void a(Collection<hof.e> $$0, ato.b $$1) {
      if (!$$1.b().isEmpty()) {
         for (hof.e $$2 : this.f) {
            if ($$2.g != hof.a.c) {
               if ($$1.b().contains($$2.a)) {
                  $$2.a(hof.d.a);
               } else {
                  $$2.a(hof.d.d);
               }
            }
         }
      }

      for (hof.e $$3 : $$0) {
         Path $$4 = $$1.a().get($$3.a);
         if ($$4 != null) {
            $$3.f = hof.b.c;
            $$3.d = $$4;
            if (!$$3.a()) {
               this.b.a($$3.a, hod.b.b);
            }
         }
      }

      this.f();
   }

   private boolean h() {
      List<hof.e> $$0 = new ArrayList<>();
      boolean $$1 = false;

      for (hof.e $$2 : this.f) {
         if (!$$2.a() && $$2.h) {
            if ($$2.f != hof.b.c) {
               $$1 = true;
            }

            if ($$2.f == hof.b.a) {
               $$2.f = hof.b.b;
               $$0.add($$2);
            }
         }
      }

      if (!$$0.isEmpty()) {
         Map<UUID, ato.c> $$3 = new HashMap<>();

         for (hof.e $$4 : $$0) {
            $$3.put($$4.a, new ato.c($$4.b, $$4.c));
         }

         this.a.a($$3, $$1x -> this.a($$0, $$1x));
      }

      return $$1;
   }

   private void i() {
      boolean $$0 = false;
      final List<hof.e> $$1 = new ArrayList<>();
      final List<hof.e> $$2 = new ArrayList<>();

      for (hof.e $$3 : this.f) {
         if ($$3.g == hof.a.b) {
            return;
         }

         boolean $$4 = $$3.h && $$3.f == hof.b.c && !$$3.a();
         if ($$4 && $$3.g == hof.a.a) {
            $$1.add($$3);
            $$0 = true;
         }

         if ($$3.g == hof.a.c) {
            if (!$$4) {
               $$0 = true;
               $$2.add($$3);
            } else {
               $$1.add($$3);
            }
         }
      }

      if ($$0) {
         for (hof.e $$5 : $$1) {
            if ($$5.g != hof.a.c) {
               $$5.g = hof.a.b;
            }
         }

         for (hof.e $$6 : $$2) {
            $$6.g = hof.a.b;
         }

         this.c.scheduleReload(new hoe.a() {
            @Override
            public void a() {
               for (hof.e $$0 : $$1) {
                  $$0.g = hof.a.c;
                  if ($$0.e == null) {
                     hof.this.b.a($$0.a, hod.a.b);
                  }
               }

               for (hof.e $$1 : $$2) {
                  $$1.g = hof.a.a;
               }

               hof.this.f();
            }

            @Override
            public void a(boolean $$0) {
               if (!$$0) {
                  $$1.clear();

                  for (hof.e $$1 : hof.this.f) {
                     switch ($$1.g) {
                        case a:
                           $$1.a(hof.d.d);
                           break;
                        case b:
                           $$1.g = hof.a.a;
                           $$1.a(hof.d.b);
                           break;
                        case c:
                           $$1.add($$1);
                     }
                  }

                  hof.this.f();
               } else {
                  for (hof.e $$2 : hof.this.f) {
                     if ($$2.g == hof.a.b) {
                        $$2.g = hof.a.a;
                     }
                  }
               }
            }

            @Override
            public List<hoe.b> b() {
               return $$1.stream().map($$0 -> new hoe.b($$0.a, $$0.d)).toList();
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
      a(hod.a.d),
      b(hod.a.e),
      c(hod.a.a),
      d(hod.a.c),
      e(null),
      f(null);

      @Nullable
      final hod.a g;

      private d(@Nullable final hod.a $$0) {
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
      hof.d e;
      hof.b f = hof.b.a;
      hof.a g = hof.a.a;
      boolean h;

      e(UUID $$0, URL $$1, @Nullable HashCode $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public void a(hof.d $$0) {
         if (this.e == null) {
            this.e = $$0;
         }
      }

      public boolean a() {
         return this.e != null;
      }
   }
}

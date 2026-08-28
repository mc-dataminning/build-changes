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

public class hod {
   private final hoa a;
   final hob b;
   private final hoc c;
   private final Runnable d;
   private hod.c e;
   final List<hod.e> f = new ArrayList<>();

   public hod(hoa $$0, hob $$1, hoc $$2, Runnable $$3, hod.c $$4) {
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
      for (hod.e $$1 : this.f) {
         if ($$1.a.equals($$0)) {
            $$1.a(hod.d.f);
         }
      }
   }

   public void a(UUID $$0, URL $$1, @Nullable HashCode $$2) {
      if (this.e == hod.c.c) {
         this.b.a($$0, hob.a.a);
      } else {
         this.a($$0, new hod.e($$0, $$1, $$2));
      }
   }

   public void a(UUID $$0, Path $$1) {
      if (this.e == hod.c.c) {
         this.b.a($$0, hob.a.a);
      } else {
         URL $$2;
         try {
            $$2 = $$1.toUri().toURL();
         } catch (MalformedURLException var5) {
            throw new IllegalStateException("Can't convert path to URL " + $$1, var5);
         }

         hod.e $$5 = new hod.e($$0, $$2, null);
         $$5.f = hod.b.c;
         $$5.d = $$1;
         this.a($$0, $$5);
      }
   }

   private void a(UUID $$0, hod.e $$1) {
      this.b($$0);
      this.f.add($$1);
      if (this.e == hod.c.b) {
         this.a($$1);
      }

      this.f();
   }

   private void a(hod.e $$0) {
      this.b.a($$0.a, hob.b.a);
      $$0.h = true;
   }

   @Nullable
   private hod.e c(UUID $$0) {
      for (hod.e $$1 : this.f) {
         if (!$$1.a() && $$1.a.equals($$0)) {
            return $$1;
         }
      }

      return null;
   }

   public void a(UUID $$0) {
      hod.e $$1 = this.c($$0);
      if ($$1 != null) {
         $$1.a(hod.d.e);
         this.f();
      }
   }

   public void a() {
      for (hod.e $$0 : this.f) {
         $$0.a(hod.d.e);
      }

      this.f();
   }

   public void b() {
      this.e = hod.c.b;

      for (hod.e $$0 : this.f) {
         if (!$$0.h && !$$0.a()) {
            this.a($$0);
         }
      }

      this.f();
   }

   public void c() {
      this.e = hod.c.c;

      for (hod.e $$0 : this.f) {
         if (!$$0.h) {
            $$0.a(hod.d.c);
         }
      }

      this.f();
   }

   public void d() {
      this.e = hod.c.a;
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
         if ($$0.g != hod.a.a) {
            return false;
         } else if ($$0.e != null) {
            hob.a $$1 = $$0.e.g;
            if ($$1 != null) {
               this.b.a($$0.a, $$1);
            }

            return true;
         } else {
            return false;
         }
      });
   }

   private void a(Collection<hod.e> $$0, atm.b $$1) {
      if (!$$1.b().isEmpty()) {
         for (hod.e $$2 : this.f) {
            if ($$2.g != hod.a.c) {
               if ($$1.b().contains($$2.a)) {
                  $$2.a(hod.d.a);
               } else {
                  $$2.a(hod.d.d);
               }
            }
         }
      }

      for (hod.e $$3 : $$0) {
         Path $$4 = $$1.a().get($$3.a);
         if ($$4 != null) {
            $$3.f = hod.b.c;
            $$3.d = $$4;
            if (!$$3.a()) {
               this.b.a($$3.a, hob.b.b);
            }
         }
      }

      this.f();
   }

   private boolean h() {
      List<hod.e> $$0 = new ArrayList<>();
      boolean $$1 = false;

      for (hod.e $$2 : this.f) {
         if (!$$2.a() && $$2.h) {
            if ($$2.f != hod.b.c) {
               $$1 = true;
            }

            if ($$2.f == hod.b.a) {
               $$2.f = hod.b.b;
               $$0.add($$2);
            }
         }
      }

      if (!$$0.isEmpty()) {
         Map<UUID, atm.c> $$3 = new HashMap<>();

         for (hod.e $$4 : $$0) {
            $$3.put($$4.a, new atm.c($$4.b, $$4.c));
         }

         this.a.a($$3, $$1x -> this.a($$0, $$1x));
      }

      return $$1;
   }

   private void i() {
      boolean $$0 = false;
      final List<hod.e> $$1 = new ArrayList<>();
      final List<hod.e> $$2 = new ArrayList<>();

      for (hod.e $$3 : this.f) {
         if ($$3.g == hod.a.b) {
            return;
         }

         boolean $$4 = $$3.h && $$3.f == hod.b.c && !$$3.a();
         if ($$4 && $$3.g == hod.a.a) {
            $$1.add($$3);
            $$0 = true;
         }

         if ($$3.g == hod.a.c) {
            if (!$$4) {
               $$0 = true;
               $$2.add($$3);
            } else {
               $$1.add($$3);
            }
         }
      }

      if ($$0) {
         for (hod.e $$5 : $$1) {
            if ($$5.g != hod.a.c) {
               $$5.g = hod.a.b;
            }
         }

         for (hod.e $$6 : $$2) {
            $$6.g = hod.a.b;
         }

         this.c.scheduleReload(new hoc.a() {
            @Override
            public void a() {
               for (hod.e $$0 : $$1) {
                  $$0.g = hod.a.c;
                  if ($$0.e == null) {
                     hod.this.b.a($$0.a, hob.a.b);
                  }
               }

               for (hod.e $$1 : $$2) {
                  $$1.g = hod.a.a;
               }

               hod.this.f();
            }

            @Override
            public void a(boolean $$0) {
               if (!$$0) {
                  $$1.clear();

                  for (hod.e $$1 : hod.this.f) {
                     switch ($$1.g) {
                        case a:
                           $$1.a(hod.d.d);
                           break;
                        case b:
                           $$1.g = hod.a.a;
                           $$1.a(hod.d.b);
                           break;
                        case c:
                           $$1.add($$1);
                     }
                  }

                  hod.this.f();
               } else {
                  for (hod.e $$2 : hod.this.f) {
                     if ($$2.g == hod.a.b) {
                        $$2.g = hod.a.a;
                     }
                  }
               }
            }

            @Override
            public List<hoc.b> b() {
               return $$1.stream().map($$0 -> new hoc.b($$0.a, $$0.d)).toList();
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
      a(hob.a.d),
      b(hob.a.e),
      c(hob.a.a),
      d(hob.a.c),
      e(null),
      f(null);

      @Nullable
      final hob.a g;

      private d(@Nullable final hob.a $$0) {
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
      hod.d e;
      hod.b f = hod.b.a;
      hod.a g = hod.a.a;
      boolean h;

      e(UUID $$0, URL $$1, @Nullable HashCode $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public void a(hod.d $$0) {
         if (this.e == null) {
            this.e = $$0;
         }
      }

      public boolean a() {
         return this.e != null;
      }
   }
}

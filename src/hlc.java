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

public class hlc {
   private final hkz a;
   final hla b;
   private final hlb c;
   private final Runnable d;
   private hlc.c e;
   final List<hlc.e> f = new ArrayList<>();

   public hlc(hkz $$0, hla $$1, hlb $$2, Runnable $$3, hlc.c $$4) {
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
      for (hlc.e $$1 : this.f) {
         if ($$1.a.equals($$0)) {
            $$1.a(hlc.d.f);
         }
      }
   }

   public void a(UUID $$0, URL $$1, @Nullable HashCode $$2) {
      if (this.e == hlc.c.c) {
         this.b.a($$0, hla.a.a);
      } else {
         this.a($$0, new hlc.e($$0, $$1, $$2));
      }
   }

   public void a(UUID $$0, Path $$1) {
      if (this.e == hlc.c.c) {
         this.b.a($$0, hla.a.a);
      } else {
         URL $$2;
         try {
            $$2 = $$1.toUri().toURL();
         } catch (MalformedURLException var5) {
            throw new IllegalStateException("Can't convert path to URL " + $$1, var5);
         }

         hlc.e $$5 = new hlc.e($$0, $$2, null);
         $$5.f = hlc.b.c;
         $$5.d = $$1;
         this.a($$0, $$5);
      }
   }

   private void a(UUID $$0, hlc.e $$1) {
      this.b($$0);
      this.f.add($$1);
      if (this.e == hlc.c.b) {
         this.a($$1);
      }

      this.f();
   }

   private void a(hlc.e $$0) {
      this.b.a($$0.a, hla.b.a);
      $$0.h = true;
   }

   @Nullable
   private hlc.e c(UUID $$0) {
      for (hlc.e $$1 : this.f) {
         if (!$$1.a() && $$1.a.equals($$0)) {
            return $$1;
         }
      }

      return null;
   }

   public void a(UUID $$0) {
      hlc.e $$1 = this.c($$0);
      if ($$1 != null) {
         $$1.a(hlc.d.e);
         this.f();
      }
   }

   public void a() {
      for (hlc.e $$0 : this.f) {
         $$0.a(hlc.d.e);
      }

      this.f();
   }

   public void b() {
      this.e = hlc.c.b;

      for (hlc.e $$0 : this.f) {
         if (!$$0.h && !$$0.a()) {
            this.a($$0);
         }
      }

      this.f();
   }

   public void c() {
      this.e = hlc.c.c;

      for (hlc.e $$0 : this.f) {
         if (!$$0.h) {
            $$0.a(hlc.d.c);
         }
      }

      this.f();
   }

   public void d() {
      this.e = hlc.c.a;
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
         if ($$0.g != hlc.a.a) {
            return false;
         } else if ($$0.e != null) {
            hla.a $$1 = $$0.e.g;
            if ($$1 != null) {
               this.b.a($$0.a, $$1);
            }

            return true;
         } else {
            return false;
         }
      });
   }

   private void a(Collection<hlc.e> $$0, ati.b $$1) {
      if (!$$1.b().isEmpty()) {
         for (hlc.e $$2 : this.f) {
            if ($$2.g != hlc.a.c) {
               if ($$1.b().contains($$2.a)) {
                  $$2.a(hlc.d.a);
               } else {
                  $$2.a(hlc.d.d);
               }
            }
         }
      }

      for (hlc.e $$3 : $$0) {
         Path $$4 = $$1.a().get($$3.a);
         if ($$4 != null) {
            $$3.f = hlc.b.c;
            $$3.d = $$4;
            if (!$$3.a()) {
               this.b.a($$3.a, hla.b.b);
            }
         }
      }

      this.f();
   }

   private boolean h() {
      List<hlc.e> $$0 = new ArrayList<>();
      boolean $$1 = false;

      for (hlc.e $$2 : this.f) {
         if (!$$2.a() && $$2.h) {
            if ($$2.f != hlc.b.c) {
               $$1 = true;
            }

            if ($$2.f == hlc.b.a) {
               $$2.f = hlc.b.b;
               $$0.add($$2);
            }
         }
      }

      if (!$$0.isEmpty()) {
         Map<UUID, ati.c> $$3 = new HashMap<>();

         for (hlc.e $$4 : $$0) {
            $$3.put($$4.a, new ati.c($$4.b, $$4.c));
         }

         this.a.a($$3, $$1x -> this.a($$0, $$1x));
      }

      return $$1;
   }

   private void i() {
      boolean $$0 = false;
      final List<hlc.e> $$1 = new ArrayList<>();
      final List<hlc.e> $$2 = new ArrayList<>();

      for (hlc.e $$3 : this.f) {
         if ($$3.g == hlc.a.b) {
            return;
         }

         boolean $$4 = $$3.h && $$3.f == hlc.b.c && !$$3.a();
         if ($$4 && $$3.g == hlc.a.a) {
            $$1.add($$3);
            $$0 = true;
         }

         if ($$3.g == hlc.a.c) {
            if (!$$4) {
               $$0 = true;
               $$2.add($$3);
            } else {
               $$1.add($$3);
            }
         }
      }

      if ($$0) {
         for (hlc.e $$5 : $$1) {
            if ($$5.g != hlc.a.c) {
               $$5.g = hlc.a.b;
            }
         }

         for (hlc.e $$6 : $$2) {
            $$6.g = hlc.a.b;
         }

         this.c.scheduleReload(new hlb.a() {
            @Override
            public void a() {
               for (hlc.e $$0 : $$1) {
                  $$0.g = hlc.a.c;
                  if ($$0.e == null) {
                     hlc.this.b.a($$0.a, hla.a.b);
                  }
               }

               for (hlc.e $$1 : $$2) {
                  $$1.g = hlc.a.a;
               }

               hlc.this.f();
            }

            @Override
            public void a(boolean $$0) {
               if (!$$0) {
                  $$1.clear();

                  for (hlc.e $$1 : hlc.this.f) {
                     switch ($$1.g) {
                        case a:
                           $$1.a(hlc.d.d);
                           break;
                        case b:
                           $$1.g = hlc.a.a;
                           $$1.a(hlc.d.b);
                           break;
                        case c:
                           $$1.add($$1);
                     }
                  }

                  hlc.this.f();
               } else {
                  for (hlc.e $$2 : hlc.this.f) {
                     if ($$2.g == hlc.a.b) {
                        $$2.g = hlc.a.a;
                     }
                  }
               }
            }

            @Override
            public List<hlb.b> b() {
               return $$1.stream().map($$0 -> new hlb.b($$0.a, $$0.d)).toList();
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
      a(hla.a.d),
      b(hla.a.e),
      c(hla.a.a),
      d(hla.a.c),
      e(null),
      f(null);

      @Nullable
      final hla.a g;

      private d(@Nullable final hla.a $$0) {
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
      hlc.d e;
      hlc.b f = hlc.b.a;
      hlc.a g = hlc.a.a;
      boolean h;

      e(UUID $$0, URL $$1, @Nullable HashCode $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public void a(hlc.d $$0) {
         if (this.e == null) {
            this.e = $$0;
         }
      }

      public boolean a() {
         return this.e != null;
      }
   }
}

import com.google.common.annotations.VisibleForTesting;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public final class ug extends AbstractList<va> implements tz {
   private static final String b = "";
   private static final int c = 36;
   public static final vc<ug> a = new vc.b<ug>() {
      public ug a(DataInput $$0, uj $$1) throws IOException {
         $$1.b();

         ug var3;
         try {
            var3 = d($$0, $$1);
         } finally {
            $$1.c();
         }

         return var3;
      }

      private static ug d(DataInput $$0, uj $$1) throws IOException {
         $$1.b(36L);
         byte $$2 = $$0.readByte();
         int $$3 = $$0.readInt();
         if ($$2 == 0 && $$3 > 0) {
            throw new um("Missing type on ListTag");
         } else {
            $$1.a(4L, (long)$$3);
            vc<?> $$4 = vd.a($$2);
            ug $$5 = new ug(new ArrayList<>($$3));

            for (int $$6 = 0; $$6 < $$3; $$6++) {
               $$5.a($$4.c($$0, $$1));
            }

            return $$5;
         }
      }

      @Override
      public ux.b a(DataInput $$0, ux $$1, uj $$2) throws IOException {
         $$2.b();

         ux.b var4;
         try {
            var4 = c($$0, $$1, $$2);
         } finally {
            $$2.c();
         }

         return var4;
      }

      private static ux.b c(DataInput $$0, ux $$1, uj $$2) throws IOException {
         $$2.b(36L);
         vc<?> $$3 = vd.a($$0.readByte());
         int $$4 = $$0.readInt();
         switch ($$1.a($$3, $$4)) {
            case c:
               return ux.b.c;
            case b:
               $$3.a($$0, $$4, $$2);
               return $$1.b();
            default:
               $$2.a(4L, (long)$$4);
               int $$5 = 0;

               while (true) {
                  label41: {
                     if ($$5 < $$4) {
                        switch ($$1.b($$3, $$5)) {
                           case d:
                              return ux.b.c;
                           case c:
                              $$3.b($$0, $$2);
                              break;
                           case b:
                              $$3.b($$0, $$2);
                              break label41;
                           default:
                              switch ($$3.a($$0, $$1, $$2)) {
                                 case c:
                                    return ux.b.c;
                                 case b:
                                    break;
                                 default:
                                    break label41;
                              }
                        }
                     }

                     int $$6 = $$4 - 1 - $$5;
                     if ($$6 > 0) {
                        $$3.a($$0, $$6, $$2);
                     }

                     return $$1.b();
                  }

                  $$5++;
               }
         }
      }

      @Override
      public void b(DataInput $$0, uj $$1) throws IOException {
         $$1.b();

         try {
            vc<?> $$2 = vd.a($$0.readByte());
            int $$3 = $$0.readInt();
            $$2.a($$0, $$3, $$1);
         } finally {
            $$1.c();
         }
      }

      @Override
      public String a() {
         return "LIST";
      }

      @Override
      public String b() {
         return "TAG_List";
      }
   };
   private final List<va> v;

   public ug() {
      this(new ArrayList<>());
   }

   ug(List<va> $$0) {
      this.v = $$0;
   }

   private static va a(ua $$0) {
      if ($$0.i() == 1) {
         va $$1 = $$0.a("");
         if ($$1 != null) {
            return $$1;
         }
      }

      return $$0;
   }

   private static boolean b(ua $$0) {
      return $$0.i() == 1 && $$0.b("");
   }

   private static va a(byte $$0, va $$1) {
      if ($$0 != 10) {
         return $$1;
      } else {
         if ($$1 instanceof ua $$2 && !b($$2)) {
            return $$2;
         }

         return b($$1);
      }
   }

   private static ua b(va $$0) {
      return new ua(Map.of("", $$0));
   }

   @Override
   public void a(DataOutput $$0) throws IOException {
      byte $$1 = this.e();
      $$0.writeByte($$1);
      $$0.writeInt(this.v.size());

      for (va $$2 : this.v) {
         a($$1, $$2).a($$0);
      }
   }

   @VisibleForTesting
   byte e() {
      byte $$0 = 0;

      for (va $$1 : this.v) {
         byte $$2 = $$1.b();
         if ($$0 == 0) {
            $$0 = $$2;
         } else if ($$0 != $$2) {
            return 10;
         }
      }

      return $$0;
   }

   public void a(va $$0) {
      if ($$0 instanceof ua $$1) {
         this.add(a($$1));
      } else {
         this.add($$0);
      }
   }

   @Override
   public int a() {
      int $$0 = 36;
      $$0 += 4 * this.v.size();

      for (va $$1 : this.v) {
         $$0 += $$1.a();
      }

      return $$0;
   }

   @Override
   public byte b() {
      return 9;
   }

   @Override
   public vc<ug> c() {
      return a;
   }

   @Override
   public String toString() {
      uz $$0 = new uz();
      $$0.a(this);
      return $$0.a();
   }

   @Override
   public va d(int $$0) {
      return this.v.remove($$0);
   }

   @Override
   public boolean isEmpty() {
      return this.v.isEmpty();
   }

   public Optional<ua> a(int $$0) {
      return this.n($$0) instanceof ua $$1 ? Optional.of($$1) : Optional.empty();
   }

   public ua b(int $$0) {
      return this.a($$0).orElseGet(ua::new);
   }

   public Optional<ug> e(int $$0) {
      return this.n($$0) instanceof ug $$1 ? Optional.of($$1) : Optional.empty();
   }

   public ug f(int $$0) {
      return this.e($$0).orElseGet(ug::new);
   }

   public Optional<Short> g(int $$0) {
      return this.o($$0).flatMap(va::q);
   }

   public short a(int $$0, short $$1) {
      return this.n($$0) instanceof uq $$2 ? $$2.i() : $$1;
   }

   public Optional<Integer> h(int $$0) {
      return this.o($$0).flatMap(va::r);
   }

   public int a(int $$0, int $$1) {
      return this.n($$0) instanceof uq $$2 ? $$2.h() : $$1;
   }

   public Optional<int[]> i(int $$0) {
      return this.n($$0) instanceof ue $$1 ? Optional.of($$1.g()) : Optional.empty();
   }

   public Optional<long[]> j(int $$0) {
      return this.n($$0) instanceof uh $$1 ? Optional.of($$1.g()) : Optional.empty();
   }

   public Optional<Double> k(int $$0) {
      return this.o($$0).flatMap(va::u);
   }

   public double a(int $$0, double $$1) {
      return this.n($$0) instanceof uq $$2 ? $$2.k() : $$1;
   }

   public Optional<Float> l(int $$0) {
      return this.o($$0).flatMap(va::t);
   }

   public float a(int $$0, float $$1) {
      return this.n($$0) instanceof uq $$2 ? $$2.l() : $$1;
   }

   public Optional<String> m(int $$0) {
      return this.o($$0).flatMap(va::p_);
   }

   public String a(int $$0, String $$1) {
      if (this.n($$0) instanceof uy var4) {
         uy var10000 = var4;

         try {
            var8 = var10000.k();
         } catch (Throwable var7) {
            throw new MatchException(var7.toString(), var7);
         }

         return var8;
      } else {
         return $$1;
      }
   }

   @Nullable
   private va n(int $$0) {
      return $$0 >= 0 && $$0 < this.v.size() ? this.v.get($$0) : null;
   }

   private Optional<va> o(int $$0) {
      return Optional.ofNullable(this.n($$0));
   }

   @Override
   public int size() {
      return this.v.size();
   }

   @Override
   public va c(int $$0) {
      return this.v.get($$0);
   }

   public va c(int $$0, va $$1) {
      return this.v.set($$0, $$1);
   }

   public void d(int $$0, va $$1) {
      this.v.add($$0, $$1);
   }

   @Override
   public boolean a(int $$0, va $$1) {
      this.v.set($$0, $$1);
      return true;
   }

   @Override
   public boolean b(int $$0, va $$1) {
      this.v.add($$0, $$1);
      return true;
   }

   public ug g() {
      List<va> $$0 = new ArrayList<>(this.v.size());

      for (va $$1 : this.v) {
         $$0.add($$1.d());
      }

      return new ug($$0);
   }

   @Override
   public Optional<ug> t_() {
      return Optional.of(this);
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 ? true : $$0 instanceof ug && Objects.equals(this.v, ((ug)$$0).v);
   }

   @Override
   public int hashCode() {
      return this.v.hashCode();
   }

   @Override
   public Stream<va> stream() {
      return super.stream();
   }

   public Stream<ua> j() {
      return this.stream().mapMulti(($$0, $$1) -> {
         if ($$0 instanceof ua $$2) {
            $$1.accept($$2);
         }
      });
   }

   @Override
   public void a(ve $$0) {
      $$0.a(this);
   }

   @Override
   public void clear() {
      this.v.clear();
   }

   @Override
   public ux.b a(ux $$0) {
      byte $$1 = this.e();
      switch ($$0.a(vd.a($$1), this.v.size())) {
         case c:
            return ux.b.c;
         case b:
            return $$0.b();
         default:
            int $$2 = 0;

            while ($$2 < this.v.size()) {
               va $$3 = a($$1, this.v.get($$2));
               switch ($$0.b($$3.c(), $$2)) {
                  case d:
                     return ux.b.c;
                  case c:
                     return $$0.b();
                  default:
                     switch ($$3.a($$0)) {
                        case c:
                           return ux.b.c;
                        case b:
                           return $$0.b();
                     }
                  case b:
                     $$2++;
               }
            }

            return $$0.b();
      }
   }
}

import com.google.common.primitives.Doubles;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import javax.annotation.Nullable;

public class hj {
   public static final char a = '@';
   private static final char o = '[';
   private static final char p = ']';
   public static final char b = '=';
   private static final char q = ',';
   public static final char c = '!';
   public static final char d = '#';
   private static final char r = 'p';
   private static final char s = 'a';
   private static final char t = 'r';
   private static final char u = 's';
   private static final char v = 'e';
   private static final char w = 'n';
   public static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(wz.c("argument.entity.invalid"));
   public static final DynamicCommandExceptionType f = new DynamicCommandExceptionType($$0 -> wz.b("argument.entity.selector.unknown", $$0));
   public static final SimpleCommandExceptionType g = new SimpleCommandExceptionType(wz.c("argument.entity.selector.not_allowed"));
   public static final SimpleCommandExceptionType h = new SimpleCommandExceptionType(wz.c("argument.entity.selector.missing"));
   public static final SimpleCommandExceptionType i = new SimpleCommandExceptionType(wz.c("argument.entity.options.unterminated"));
   public static final DynamicCommandExceptionType j = new DynamicCommandExceptionType($$0 -> wz.b("argument.entity.options.valueless", $$0));
   public static final BiConsumer<exc, List<? extends bsr>> k = ($$0, $$1) -> $$1.sort(($$1x, $$2) -> Doubles.compare($$1x.g($$0), $$2.g($$0)));
   public static final BiConsumer<exc, List<? extends bsr>> l = ($$0, $$1) -> $$1.sort(($$1x, $$2) -> Doubles.compare($$2.g($$0), $$1x.g($$0)));
   public static final BiConsumer<exc, List<? extends bsr>> m = ($$0, $$1) -> Collections.shuffle($$1);
   public static final BiFunction<SuggestionsBuilder, Consumer<SuggestionsBuilder>, CompletableFuture<Suggestions>> n = ($$0, $$1) -> $$0.buildFuture();
   private final StringReader x;
   private final boolean y;
   private int z;
   private boolean A;
   private boolean B;
   private dh.c C = dh.c.c;
   private dh.d D = dh.d.c;
   @Nullable
   private Double E;
   @Nullable
   private Double F;
   @Nullable
   private Double G;
   @Nullable
   private Double H;
   @Nullable
   private Double I;
   @Nullable
   private Double J;
   private ek K = ek.a;
   private ek L = ek.a;
   private final List<Predicate<bsr>> M = new ArrayList<>();
   private BiConsumer<exc, List<? extends bsr>> N = hi.b;
   private boolean O;
   @Nullable
   private String P;
   private int Q;
   @Nullable
   private UUID R;
   private BiFunction<SuggestionsBuilder, Consumer<SuggestionsBuilder>, CompletableFuture<Suggestions>> S = n;
   private boolean T;
   private boolean U;
   private boolean V;
   private boolean W;
   private boolean X;
   private boolean Y;
   private boolean Z;
   private boolean aa;
   @Nullable
   private bsx<?> ab;
   private boolean ac;
   private boolean ad;
   private boolean ae;
   private boolean af;

   public hj(StringReader $$0) {
      this($$0, true);
   }

   public hj(StringReader $$0, boolean $$1) {
      this.x = $$0;
      this.y = $$1;
   }

   public hi a() {
      ewx $$2;
      if (this.H == null && this.I == null && this.J == null) {
         if (this.C.b().isPresent()) {
            double $$1 = this.C.b().get();
            $$2 = new ewx(-$$1, -$$1, -$$1, $$1 + 1.0, $$1 + 1.0, $$1 + 1.0);
         } else {
            $$2 = null;
         }
      } else {
         $$2 = this.a(this.H == null ? 0.0 : this.H, this.I == null ? 0.0 : this.I, this.J == null ? 0.0 : this.J);
      }

      Function<exc, exc> $$4;
      if (this.E == null && this.F == null && this.G == null) {
         $$4 = $$0 -> $$0;
      } else {
         $$4 = $$0 -> new exc(this.E == null ? $$0.c : this.E, this.F == null ? $$0.d : this.F, this.G == null ? $$0.e : this.G);
      }

      return new hi(this.z, this.A, this.B, List.copyOf(this.M), this.C, $$4, $$2, this.N, this.O, this.P, this.R, this.ab, this.af);
   }

   private ewx a(double $$0, double $$1, double $$2) {
      boolean $$3 = $$0 < 0.0;
      boolean $$4 = $$1 < 0.0;
      boolean $$5 = $$2 < 0.0;
      double $$6 = $$3 ? $$0 : 0.0;
      double $$7 = $$4 ? $$1 : 0.0;
      double $$8 = $$5 ? $$2 : 0.0;
      double $$9 = ($$3 ? 0.0 : $$0) + 1.0;
      double $$10 = ($$4 ? 0.0 : $$1) + 1.0;
      double $$11 = ($$5 ? 0.0 : $$2) + 1.0;
      return new ewx($$6, $$7, $$8, $$9, $$10, $$11);
   }

   private void I() {
      if (this.K != ek.a) {
         this.M.add(this.a(this.K, bsr::dG));
      }

      if (this.L != ek.a) {
         this.M.add(this.a(this.L, bsr::dE));
      }

      if (!this.D.c()) {
         this.M.add($$0 -> !($$0 instanceof aqv) ? false : this.D.d(((aqv)$$0).cq));
      }
   }

   private Predicate<bsr> a(ek $$0, ToDoubleFunction<bsr> $$1) {
      double $$2 = (double)ayo.g($$0.b() == null ? 0.0F : $$0.b());
      double $$3 = (double)ayo.g($$0.c() == null ? 359.0F : $$0.c());
      return $$3x -> {
         double $$4 = ayo.d($$1.applyAsDouble($$3x));
         return $$2 > $$3 ? $$4 >= $$2 || $$4 <= $$3 : $$4 >= $$2 && $$4 <= $$3;
      };
   }

   protected void b() throws CommandSyntaxException {
      this.af = true;
      this.S = this::d;
      if (!this.x.canRead()) {
         throw h.createWithContext(this.x);
      } else {
         int $$0 = this.x.getCursor();
         char $$1 = this.x.read();

         if (switch ($$1) {
            case 'a' -> {
               this.z = Integer.MAX_VALUE;
               this.A = false;
               this.N = hi.b;
               this.a(bsx.by);
               yield false;
            }
            default -> {
               this.x.setCursor($$0);
               throw f.createWithContext(this.x, "@" + $$1);
            }
            case 'e' -> {
               this.z = Integer.MAX_VALUE;
               this.A = true;
               this.N = hi.b;
               yield true;
            }
            case 'n' -> {
               this.z = 1;
               this.A = true;
               this.N = k;
               yield true;
            }
            case 'p' -> {
               this.z = 1;
               this.A = false;
               this.N = k;
               this.a(bsx.by);
               yield false;
            }
            case 'r' -> {
               this.z = 1;
               this.A = false;
               this.N = m;
               this.a(bsx.by);
               yield false;
            }
            case 's' -> {
               this.z = 1;
               this.A = true;
               this.O = true;
               yield false;
            }
         }) {
            this.M.add(bsr::bE);
         }

         this.S = this::e;
         if (this.x.canRead() && this.x.peek() == '[') {
            this.x.skip();
            this.S = this::f;
            this.d();
         }
      }
   }

   protected void c() throws CommandSyntaxException {
      if (this.x.canRead()) {
         this.S = this::c;
      }

      int $$0 = this.x.getCursor();
      String $$1 = this.x.readString();

      try {
         this.R = UUID.fromString($$1);
         this.A = true;
      } catch (IllegalArgumentException var4) {
         if ($$1.isEmpty() || $$1.length() > 16) {
            this.x.setCursor($$0);
            throw e.createWithContext(this.x);
         }

         this.A = false;
         this.P = $$1;
      }

      this.z = 1;
   }

   protected void d() throws CommandSyntaxException {
      this.S = this::g;
      this.x.skipWhitespace();

      while (this.x.canRead() && this.x.peek() != ']') {
         this.x.skipWhitespace();
         int $$0 = this.x.getCursor();
         String $$1 = this.x.readString();
         hk.a $$2 = hk.a(this, $$1, $$0);
         this.x.skipWhitespace();
         if (!this.x.canRead() || this.x.peek() != '=') {
            this.x.setCursor($$0);
            throw j.createWithContext(this.x, $$1);
         }

         this.x.skip();
         this.x.skipWhitespace();
         this.S = n;
         $$2.handle(this);
         this.x.skipWhitespace();
         this.S = this::h;
         if (this.x.canRead()) {
            if (this.x.peek() != ',') {
               if (this.x.peek() != ']') {
                  throw i.createWithContext(this.x);
               }
               break;
            }

            this.x.skip();
            this.S = this::g;
         }
      }

      if (this.x.canRead()) {
         this.x.skip();
         this.S = n;
      } else {
         throw i.createWithContext(this.x);
      }
   }

   public boolean e() {
      this.x.skipWhitespace();
      if (this.x.canRead() && this.x.peek() == '!') {
         this.x.skip();
         this.x.skipWhitespace();
         return true;
      } else {
         return false;
      }
   }

   public boolean f() {
      this.x.skipWhitespace();
      if (this.x.canRead() && this.x.peek() == '#') {
         this.x.skip();
         this.x.skipWhitespace();
         return true;
      } else {
         return false;
      }
   }

   public StringReader g() {
      return this.x;
   }

   public void a(Predicate<bsr> $$0) {
      this.M.add($$0);
   }

   public void h() {
      this.B = true;
   }

   public dh.c i() {
      return this.C;
   }

   public void a(dh.c $$0) {
      this.C = $$0;
   }

   public dh.d j() {
      return this.D;
   }

   public void a(dh.d $$0) {
      this.D = $$0;
   }

   public ek k() {
      return this.K;
   }

   public void a(ek $$0) {
      this.K = $$0;
   }

   public ek l() {
      return this.L;
   }

   public void b(ek $$0) {
      this.L = $$0;
   }

   @Nullable
   public Double m() {
      return this.E;
   }

   @Nullable
   public Double n() {
      return this.F;
   }

   @Nullable
   public Double o() {
      return this.G;
   }

   public void a(double $$0) {
      this.E = $$0;
   }

   public void b(double $$0) {
      this.F = $$0;
   }

   public void c(double $$0) {
      this.G = $$0;
   }

   public void d(double $$0) {
      this.H = $$0;
   }

   public void e(double $$0) {
      this.I = $$0;
   }

   public void f(double $$0) {
      this.J = $$0;
   }

   @Nullable
   public Double p() {
      return this.H;
   }

   @Nullable
   public Double q() {
      return this.I;
   }

   @Nullable
   public Double r() {
      return this.J;
   }

   public void a(int $$0) {
      this.z = $$0;
   }

   public void a(boolean $$0) {
      this.A = $$0;
   }

   public BiConsumer<exc, List<? extends bsr>> s() {
      return this.N;
   }

   public void a(BiConsumer<exc, List<? extends bsr>> $$0) {
      this.N = $$0;
   }

   public hi t() throws CommandSyntaxException {
      this.Q = this.x.getCursor();
      this.S = this::b;
      if (this.x.canRead() && this.x.peek() == '@') {
         if (!this.y) {
            throw g.createWithContext(this.x);
         }

         this.x.skip();
         this.b();
      } else {
         this.c();
      }

      this.I();
      return this.a();
   }

   private static void a(SuggestionsBuilder $$0) {
      $$0.suggest("@p", wz.c("argument.entity.selector.nearestPlayer"));
      $$0.suggest("@a", wz.c("argument.entity.selector.allPlayers"));
      $$0.suggest("@r", wz.c("argument.entity.selector.randomPlayer"));
      $$0.suggest("@s", wz.c("argument.entity.selector.self"));
      $$0.suggest("@e", wz.c("argument.entity.selector.allEntities"));
      $$0.suggest("@n", wz.c("argument.entity.selector.nearestEntity"));
   }

   private CompletableFuture<Suggestions> b(SuggestionsBuilder $$0, Consumer<SuggestionsBuilder> $$1) {
      $$1.accept($$0);
      if (this.y) {
         a($$0);
      }

      return $$0.buildFuture();
   }

   private CompletableFuture<Suggestions> c(SuggestionsBuilder $$0, Consumer<SuggestionsBuilder> $$1) {
      SuggestionsBuilder $$2 = $$0.createOffset(this.Q);
      $$1.accept($$2);
      return $$0.add($$2).buildFuture();
   }

   private CompletableFuture<Suggestions> d(SuggestionsBuilder $$0, Consumer<SuggestionsBuilder> $$1) {
      SuggestionsBuilder $$2 = $$0.createOffset($$0.getStart() - 1);
      a($$2);
      $$0.add($$2);
      return $$0.buildFuture();
   }

   private CompletableFuture<Suggestions> e(SuggestionsBuilder $$0, Consumer<SuggestionsBuilder> $$1) {
      $$0.suggest(String.valueOf('['));
      return $$0.buildFuture();
   }

   private CompletableFuture<Suggestions> f(SuggestionsBuilder $$0, Consumer<SuggestionsBuilder> $$1) {
      $$0.suggest(String.valueOf(']'));
      hk.a(this, $$0);
      return $$0.buildFuture();
   }

   private CompletableFuture<Suggestions> g(SuggestionsBuilder $$0, Consumer<SuggestionsBuilder> $$1) {
      hk.a(this, $$0);
      return $$0.buildFuture();
   }

   private CompletableFuture<Suggestions> h(SuggestionsBuilder $$0, Consumer<SuggestionsBuilder> $$1) {
      $$0.suggest(String.valueOf(','));
      $$0.suggest(String.valueOf(']'));
      return $$0.buildFuture();
   }

   private CompletableFuture<Suggestions> i(SuggestionsBuilder $$0, Consumer<SuggestionsBuilder> $$1) {
      $$0.suggest(String.valueOf('='));
      return $$0.buildFuture();
   }

   public boolean u() {
      return this.O;
   }

   public void a(BiFunction<SuggestionsBuilder, Consumer<SuggestionsBuilder>, CompletableFuture<Suggestions>> $$0) {
      this.S = $$0;
   }

   public CompletableFuture<Suggestions> a(SuggestionsBuilder $$0, Consumer<SuggestionsBuilder> $$1) {
      return this.S.apply($$0.createOffset(this.x.getCursor()), $$1);
   }

   public boolean v() {
      return this.T;
   }

   public void b(boolean $$0) {
      this.T = $$0;
   }

   public boolean w() {
      return this.U;
   }

   public void c(boolean $$0) {
      this.U = $$0;
   }

   public boolean x() {
      return this.V;
   }

   public void d(boolean $$0) {
      this.V = $$0;
   }

   public boolean y() {
      return this.W;
   }

   public void e(boolean $$0) {
      this.W = $$0;
   }

   public boolean z() {
      return this.X;
   }

   public void f(boolean $$0) {
      this.X = $$0;
   }

   public boolean A() {
      return this.Y;
   }

   public void g(boolean $$0) {
      this.Y = $$0;
   }

   public boolean B() {
      return this.Z;
   }

   public void h(boolean $$0) {
      this.Z = $$0;
   }

   public boolean C() {
      return this.aa;
   }

   public void i(boolean $$0) {
      this.aa = $$0;
   }

   public void a(bsx<?> $$0) {
      this.ab = $$0;
   }

   public void D() {
      this.ac = true;
   }

   public boolean E() {
      return this.ab != null;
   }

   public boolean F() {
      return this.ac;
   }

   public boolean G() {
      return this.ad;
   }

   public void j(boolean $$0) {
      this.ad = $$0;
   }

   public boolean H() {
      return this.ae;
   }

   public void k(boolean $$0) {
      this.ae = $$0;
   }
}

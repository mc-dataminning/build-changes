import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record xk(xl j, xl k) {
   public static final Codec<xk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(xl.a.fieldOf("chat").forGetter(xk::a), xl.a.fieldOf("narration").forGetter(xk::b)).apply($$0, xk::new)
   );
   public static final xl b = xl.a("chat.type.text");
   public static final ald<xk> c = a("chat");
   public static final ald<xk> d = a("say_command");
   public static final ald<xk> e = a("msg_command_incoming");
   public static final ald<xk> f = a("msg_command_outgoing");
   public static final ald<xk> g = a("team_msg_command_incoming");
   public static final ald<xk> h = a("team_msg_command_outgoing");
   public static final ald<xk> i = a("emote_command");

   private static ald<xk> a(String $$0) {
      return ald.a(lq.aA, new ale($$0));
   }

   public static void a(rc<xk> $$0) {
      $$0.a(c, new xk(b, xl.a("chat.type.text.narrate")));
      $$0.a(d, new xk(xl.a("chat.type.announcement"), xl.a("chat.type.text.narrate")));
      $$0.a(e, new xk(xl.b("commands.message.display.incoming"), xl.a("chat.type.text.narrate")));
      $$0.a(f, new xk(xl.c("commands.message.display.outgoing"), xl.a("chat.type.text.narrate")));
      $$0.a(g, new xk(xl.d("chat.type.team.text"), xl.a("chat.type.text.narrate")));
      $$0.a(h, new xk(xl.d("chat.type.team.sent"), xl.a("chat.type.text.narrate")));
      $$0.a(i, new xk(xl.a("chat.type.emote"), xl.a("chat.type.emote")));
   }

   public static xk.a a(ald<xk> $$0, bss $$1) {
      return a($$0, $$1.dP().H_(), $$1.O_());
   }

   public static xk.a a(ald<xk> $$0, ep $$1) {
      return a($$0, $$1.v(), $$1.b());
   }

   public static xk.a a(ald<xk> $$0, jw $$1, xo $$2) {
      jv<xk> $$3 = $$1.d(lq.aA);
      return new xk.a($$3.g($$0), $$2);
   }

   public xl a() {
      return this.j;
   }

   public xl b() {
      return this.k;
   }

   public static record a(ji<xk> b, xo c, Optional<xo> d) {
      public static final zm<wz, xk.a> a = zm.a(zk.b(lq.aA), xk.a::a, xq.d, xk.a::b, xq.e, xk.a::c, xk.a::new);

      a(ji<xk> $$0, xo $$1) {
         this($$0, $$1, Optional.empty());
      }

      public xo a(xo $$0) {
         return this.b.a().a().a($$0, this);
      }

      public xo b(xo $$0) {
         return this.b.a().b().a($$0, this);
      }

      public xk.a c(xo $$0) {
         return new xk.a(this.b, this.c, Optional.of($$0));
      }

      public ji<xk> a() {
         return this.b;
      }

      public xo b() {
         return this.c;
      }

      public Optional<xo> c() {
         return this.d;
      }
   }
}

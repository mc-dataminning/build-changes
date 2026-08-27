import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record tb(tc j, tc k) {
   public static final Codec<tb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(tc.a.fieldOf("chat").forGetter(tb::a), tc.a.fieldOf("narration").forGetter(tb::b)).apply($$0, tb::new)
   );
   public static final tc b = tc.a("chat.type.text");
   public static final aeq<tb> c = a("chat");
   public static final aeq<tb> d = a("say_command");
   public static final aeq<tb> e = a("msg_command_incoming");
   public static final aeq<tb> f = a("msg_command_outgoing");
   public static final aeq<tb> g = a("team_msg_command_incoming");
   public static final aeq<tb> h = a("team_msg_command_outgoing");
   public static final aeq<tb> i = a("emote_command");

   private static aeq<tb> a(String $$0) {
      return aeq.a(jc.aq, new aer($$0));
   }

   public static void a(nm<tb> $$0) {
      $$0.a(c, new tb(b, tc.a("chat.type.text.narrate")));
      $$0.a(d, new tb(tc.a("chat.type.announcement"), tc.a("chat.type.text.narrate")));
      $$0.a(e, new tb(tc.b("commands.message.display.incoming"), tc.a("chat.type.text.narrate")));
      $$0.a(f, new tb(tc.c("commands.message.display.outgoing"), tc.a("chat.type.text.narrate")));
      $$0.a(g, new tb(tc.d("chat.type.team.text"), tc.a("chat.type.text.narrate")));
      $$0.a(h, new tb(tc.d("chat.type.team.sent"), tc.a("chat.type.text.narrate")));
      $$0.a(i, new tb(tc.a("chat.type.emote"), tc.a("chat.type.emote")));
   }

   public static tb.a a(aeq<tb> $$0, bii $$1) {
      return a($$0, $$1.dK().B_(), $$1.H_());
   }

   public static tb.a a(aeq<tb> $$0, dr $$1) {
      return a($$0, $$1.v(), $$1.b());
   }

   public static tb.a a(aeq<tb> $$0, hs $$1, tf $$2) {
      hr<tb> $$3 = $$1.d(jc.aq);
      return $$3.e($$0).a($$2);
   }

   public tb.a a(tf $$0) {
      return new tb.a(this, $$0);
   }

   public tc a() {
      return this.j;
   }

   public tc b() {
      return this.k;
   }

   public static record a(tb a, tf b, @Nullable tf c) {
      a(tb $$0, tf $$1) {
         this($$0, $$1, null);
      }

      public tf a(tf $$0) {
         return this.a.a().a($$0, this);
      }

      public tf b(tf $$0) {
         return this.a.b().a($$0, this);
      }

      public tb.a c(tf $$0) {
         return new tb.a(this.a, this.b, $$0);
      }

      public tb.b a(hs $$0) {
         hr<tb> $$1 = $$0.d(jc.aq);
         return new tb.b($$1.a(this.a), this.b, this.c);
      }
   }

   public static record b(int a, tf b, @Nullable tf c) {
      public b(si $$0) {
         this($$0.m(), $$0.l(), $$0.c(si::l));
      }

      public void a(si $$0) {
         $$0.c(this.a);
         $$0.a(this.b);
         $$0.a(this.c, si::a);
      }

      public Optional<tb.a> a(hs $$0) {
         hr<tb> $$1 = $$0.d(jc.aq);
         tb $$2 = $$1.a(this.a);
         return Optional.ofNullable($$2).map($$0x -> new tb.a($$0x, this.b, this.c));
      }
   }
}
